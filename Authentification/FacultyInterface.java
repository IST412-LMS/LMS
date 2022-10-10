package learningmanagementsystem.Authentification;
import java.util.Scanner;

public class FacultyInterface {
    public FacultyInterface(){
        System.out.println("Welcome to Faculty Interface");
        System.out.println("Select Functionality:");
        System.out.println("1. Assignment Grading ");
        System.out.println("2. Communication");
        System.out.println("3. Exit Application");
        
        Scanner mScan = new Scanner(System.in);
        int choice = mScan.nextInt();
        switch (choice) {
            case 1:
                //TODO go to gradebook
                System.out.println("Here is the grading");
                break;
            case 2:
                //TODO go to communication
                System.out.println("Here is communication");
                break;
            case 3:
                return;
            default:
                break;
            }
        }
}
