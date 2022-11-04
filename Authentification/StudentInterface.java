package learningmanagementsystem.Authentification;

import learningmanagementsystem.Assignments.AssignmentList;
import learningmanagementsystem.Communication.Inbox;
import learningmanagementsystem.Authentification.Tabs;

import java.util.Scanner;

public class StudentInterface {
    Tabs tabs = new Tabs();

    public StudentInterface(Person s1) {
        System.out.println("Welcome to Student Interface, " + s1.getName());
        System.out.println("Select Functionality:");
        System.out.println("1. Assignment Submissions ");
        System.out.println("2. Communication");
        System.out.println("3. Exit Application");

        Scanner mScan = new Scanner(System.in);
        int choice = mScan.nextInt();
        switch (choice) {
            case 1:
                // TODO go to submissions list
                System.out.println("Here is the assignment list");
                AssignmentList al = new AssignmentList();
                break;
            case 2:
                // TODO go to communication
                System.out.println("Here is communication");
                Inbox inbox = new Inbox();
                inbox.CheckInbox();
                break;
            case 3:
                return;
            default:
                break;
        }
    }
}
