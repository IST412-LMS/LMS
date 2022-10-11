package learningmanagementsystem.Authentification;
import java.util.Scanner;
import learningmanagementsystem.Communication.CheckInbox;
import learningmanagementsystem.AssignmentEvaluation.GradeAssignment;
import learningmanagementsystem.AssignmentEvaluation.UploadGrade;

public class FacultyInterface {
    public FacultyInterface(){
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
                //TODO go to gradebook
                System.out.println("Here is the grading");
                //check if assignment has been graded
                if(isGraded == true){
                    //immediately go to upload grade
                    UploadGrade ug = new UploadGrade();
                } else {
                    //open GradeAssignment
                    GradeAssignment ga = new GradeAssignment();
                }
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