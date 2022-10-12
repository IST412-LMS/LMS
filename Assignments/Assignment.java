package learningmanagementsystem.Assignments;

import java.util.Scanner;

public class Assignment {
    // grade assignment
    public void GradeAssignment() {
        // allow assignment to be graded
        System.out.println("Select Option:");
        System.out.println("1. Download Submission ");
        System.out.println("2. Add Comment");
        System.out.println("3. Add Grade");
        System.out.println("4. Upload Grade");
        System.out.println("5. Exit Application");

        Scanner mScan = new Scanner(System.in);
        int choice = mScan.nextInt();

        switch (choice) {
            case 1:
                // TODO go to gradebook
                System.out.println("Here is the submission");
                break;
            case 2:
                // TODO save comments
                System.out.println("Enter your comment now");
                String currentComment = mScan.nextLine();
                System.out.println(currentComment);
                break;
            case 3:
                // TODO save grades
                System.out.println("Enter your grade now");
                String currentGrade = mScan.nextLine();
                System.out.println(currentGrade);
                break;
            case 4:
                // call upload grade
                UploadGrade();
                break;
            case 5:
                return;
            default:
                break;
        }
    }

    // upload grade
    public void UploadGrade() {
        // post grade and comments
        System.out.println("Your grade has been uploaded");
    }

    // veiw assignment
    public void ViewAssignment() {
        // shows rubric

        // allow assignment to be seen
        System.out.println("Select Option:");
        System.out.println("1. Submit this Assignment");
        System.out.println("2. Exit Application");

        Scanner mScan = new Scanner(System.in);
        int choice = mScan.nextInt();

        switch (choice) {
            case 1:
                // TODO go to view page
                System.out.println("Here is the submission page");
                // onClick of submission button open submission box
                SubmitAssignment();
                break;
            case 2:
                return;
            default:
                break;
        }
    }

    // assignment submission page
    public void SubmitAssignment() {
        System.out.println("You have made it to the submission page");
        // quiz submission
        // assignment submission
        // file type
        // add comments
        // file upload
    }
}
