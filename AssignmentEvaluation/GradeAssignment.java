/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package learningmanagementsystem.AssignmentEvaluation;

import java.util.Scanner;

/**
 * 
 * 1. download submission
 * 2. add grade
 * 3. add comment
 */
public class GradeAssignment {
    public GradeAssignment() {
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
                UploadGrade ug = new UploadGrade();
                break;
            case 5:
                return;
            default:
                break;
        }
    }
}
