package learningmanagementsystem.Authentification;

import learningmanagementsystem.Authentification.Person;
import learningmanagementsystem.AssignmentSubmission.AssignmentList;
import learningmanagementsystem.Communication.CheckInbox;

import java.util.Scanner;

public class StudentInterface {
    public StudentInterface(Person s1){
        System.out.println("Welcome to Student Interface, " + s1.getName());
        System.out.println("Select Functionality:");
        System.out.println("1. Assignment Submissions ");
        System.out.println("2. Communication");
        System.out.println("3. Exit Application");
        
        Scanner mScan = new Scanner(System.in);
        int choice = mScan.nextInt();
        switch (choice) {
            case 1:
                //TODO go to submissions list
                System.out.println("Here is the assignment list");
                AssignmentList al = new AssignmentList();
                break;
            case 2:
                //TODO go to communication
                System.out.println("Here is communication");
                CheckInbox ci = new CheckInbox();
                break;
            case 3:
                return;
            default:
                break;
            }
        }
    }
