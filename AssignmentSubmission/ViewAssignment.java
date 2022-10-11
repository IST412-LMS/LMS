/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package learningmanagementsystem.AssignmentSubmission;

import java.util.Scanner;

/**
 * 1. view rubric
 */
public class ViewAssignment {
    public ViewAssignment() {
        // shows rubric

        // allow assignment to be seen
        System.out.println("Select Option:");
        System.out.println("1. Select Assignment");
        System.out.println("2. Exit Application");

        Scanner mScan = new Scanner(System.in);
        int choice = mScan.nextInt();

        switch (choice) {
            case 1:
                // TODO go to view page
                System.out.println("Here is the submission page");
                // onClick of submission button open submission box
                SubmitAssignment sa = new SubmitAssignment();
                break;
            case 2:
                return;
            default:
                break;
        }
    }
}
