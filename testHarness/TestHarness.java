/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package learningmanagementsystem.testHarness;

import java.io.Console;

import learningmanagementsystem.Authentification.LoginController;

/**
 *
 * @author hkgob
 */
public class TestHarness {
    public static void main(String[] args) {
        // calls the login controller
        LoginController lc = new LoginController();

        // Below are the five tasks we plan to test
        // Each of the tasks list the input in order to reach the end and correctly test
        // They also tell you what the output should be

        // 1. faculty uploading grade
        // FACULTY, facIST123, 1, 4
        // "Your grade has been uploaded"

        // 2. faculty send email
        // FACULTY, facIST123, 2, 1
        // "You have made it to the sendEmail page"

        // 3. faculty quit
        // FACULTY, facIST123, 3
        // program will quit

        // 4. student submitting
        // STUDENT, studIST123, 1, 1, 1
        // "You have made it to the submission page"

        // 5. student changing assignment list view
        // STUDENT, studIST123, 1, 2
        // "Changing view"

    }
}
