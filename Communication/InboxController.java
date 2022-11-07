package learningmanagementsystem.Communication;

import java.util.ArrayList;
import java.util.Scanner;

import learningmanagementsystem.Authentification.Person;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class InboxController {
    // public InboxInterface ii;

    // public InboxController() {
    // // make faculty interface
    // this.ii = new InboxInterface();
    // ii.initComponents();
    // ii.setVisible(true);
    // }

    // list view of all recieved emails
    // public void CheckInbox() {
    // // allow assignment to be seen
    // System.out.println("Select Option:");
    // System.out.println("1. Send Email");
    // System.out.println("2. Read Sent Emails");
    // System.out.println("3. Read Recieved Emails");
    // System.out.println("4. Exit Application");

    // Scanner mScan = new Scanner(System.in);
    // int choice = mScan.nextInt();

    // switch (choice) {
    // case 1:
    // // onCLick of send email
    // SendEmail();
    // break;
    // case 2:
    // // when they select to read sent emails
    // ReadSentEmail();
    // break;
    // case 3:
    // // when they select to read recieved emails
    // ReadRecievedEmail();
    // break;
    // case 4:
    // return;
    // default:
    // break;
    // }
    // }

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

    // find recipient(s) by search
    // compose/edit email
    // send new email
    public void SendEmail(String recipient, String message) {
        try {
            FileWriter myWriter = new FileWriter("sentEmails.txt");
            BufferedWriter bw = new BufferedWriter(myWriter);
            String savedEmail = "Email was sent to " + recipient + " and it said: " + message;
            bw.write(savedEmail);
            bw.newLine();
            bw.close();

            // Scanner scan = new Scanner(System.in);
            // System.out.println("You have made it to the sendEmail page!");
            // // ask who the recipient is
            // System.out.println("Please type the recipient email: ");
            // String recipient = scan.nextLine();
            // // ask the message
            // System.out.println("What is the message you would like to send to " +
            // recipient + ": ");
            // String message = scan.nextLine();
            // // confirm send
            // System.out.println("You are trying to send '" + message + "' to " +
            // recipient);
            // System.out.println("Press S to send or anything else to cancel");
            // String answer = scan.next();
            // if ((answer.equals("s")) || (answer.equals("S"))) {
            // String savedEmail = "Email was sent to " + recipient + " and it said: " +
            // message;
            // bw.write(savedEmail);
            // bw.newLine();
            // bw.close();
            // System.out.println("Message has been sent");
            // } else {
            // System.out.println("Sending message has been cancelled, starting over");
            // SendEmail();
            // }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error occured");
        }
    }
}
