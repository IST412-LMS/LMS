/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package learningmanagementsystem.Assignments;

import java.util.Scanner;

/**
 * 1. shows assignments
 * 2. allows toggle between calendar and list view
 */
public class AssignmentList {
    public AssignmentList() {
        boolean listView = true;

        // allow assignment to be seen
        System.out.println("Select Option:");
        System.out.println("1. Select Assignment");
        System.out.println("2. Change view");
        System.out.println("3. Exit Application");

        Scanner mScan = new Scanner(System.in);
        int choice = mScan.nextInt();

        switch (choice) {
            case 1:
                // TODO go to view page
                System.out.println("Here is the veiw page");
                // onCLick of specific assignemnt
                Assignment assigView = new Assignment();
                assigView.ViewAssignment();
                break;
            case 2:
                System.out.println("Changing view");
                if (listView == true) {
                    // change view
                    // update boolean
                    listView = false;
                }
            case 3:
                return;
            default:
                break;
        }
    }
}
