/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package learningmanagementsystem.Communication;

import java.util.Scanner;

/**
 * 1. list view of all recieved emails
 * 2. boolean stores ifOpened
 * 3. bold unopened
 */
public class CheckInbox {
    // list view of all recieved emails
    public CheckInbox() {
        // allow assignment to be seen
        System.out.println("Select Option:");
        System.out.println("1. Send Email");
        System.out.println("3. Exit Application");

        Scanner mScan = new Scanner(System.in);
        int choice = mScan.nextInt();

        switch (choice) {
            case 1:
                // onCLick of send email
                SendEmail se = new SendEmail();
                break;
            case 2:
                return;
            default:
                break;
        }
    }
}
