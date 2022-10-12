package learningmanagementsystem.Communication;

import java.util.Scanner;

public class Inbox {
    // list view of all recieved emails
    public void CheckInbox() {
        // allow assignment to be seen
        System.out.println("Select Option:");
        System.out.println("1. Send Email");
        System.out.println("3. Exit Application");

        Scanner mScan = new Scanner(System.in);
        int choice = mScan.nextInt();

        switch (choice) {
            case 1:
                // onCLick of send email
                SendEmail();
                break;
            case 2:
                return;
            default:
                break;
        }
    }

    // find recipient(s) by search
    // compose/edit email
    // send new email
    public void SendEmail() {
        System.out.println("You have made it to the sendEmail page");
    }
}
