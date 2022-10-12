package learningmanagementsystem.Authentification;

import java.util.Scanner;

import learningmanagementsystem.Assignments.Assignment;
import learningmanagementsystem.Communication.Inbox;

public class FacultyInterface {
    public FacultyInterface() {
        System.out.println("Welcome to Faculty Interface");
        System.out.println("Select Functionality:");
        System.out.println("1. Assignment Grading ");
        System.out.println("2. Communication");
        System.out.println("3. Exit Application");

        Scanner mScan = new Scanner(System.in);
        int choice = mScan.nextInt();
        boolean isGraded = false;
        switch (choice) {
            case 1:
                // TODO go to gradebook
                System.out.println("Here is the grading");
                // check if assignment has been graded
                if (isGraded == true) {
                    // immediately go to upload grade
                    Assignment assigUpload = new Assignment();
                    assigUpload.UploadGrade();
                } else {
                    // open GradeAssignment
                    Assignment assig = new Assignment();
                    assig.GradeAssignment();
                }
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
