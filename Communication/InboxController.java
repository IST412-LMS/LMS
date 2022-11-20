package learningmanagementsystem.Communication;

import java.util.ArrayList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class InboxController {

    public ArrayList<String> ReadRecievedEmail() {
        ArrayList<String> recievedEmailList = new ArrayList<String>();
        try {
            FileReader fileReader = new FileReader("recievedEmails.txt");
            BufferedReader reader = new BufferedReader(fileReader);
            String line;

            if ((line = reader.readLine()) == null) {
                recievedEmailList.add("No emails");
            } else {
                while ((line = reader.readLine()) != null) {
                    recievedEmailList.add(line);
                }
            }
            reader.close();
        } catch (Exception e) {
            recievedEmailList.add("Error occured");
            System.out.println("Error occured");
        }
        return recievedEmailList;
    }

    public ArrayList<String> ReadSentEmail() {
        ArrayList<String> sentEmailList = new ArrayList<String>();

        try {
            FileReader fileReader = new FileReader("sentEmails.txt");
            BufferedReader reader = new BufferedReader(fileReader);
            String line;

            while ((line = reader.readLine()) != null) {
                sentEmailList.add(line);
            }

            reader.close();
        } catch (Exception e) {
            sentEmailList.add("Error occured");
            System.out.println("Error occured");
        }
        return sentEmailList;
    }

    public void SendEmail(String recipient, String message) {
        try {
            FileWriter myWriter = new FileWriter("sentEmails.txt");
            BufferedWriter bw = new BufferedWriter(myWriter);
            String savedEmail = "Email was sent to " + recipient + " and it said: " + message;
            bw.write(savedEmail);
            bw.newLine();
            bw.close();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error occured");
        }
    }
}
