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
        Console console = System.console();
        if (console == null) {
            System.err.println("No console.");
            System.exit(1);
        }
        // while (true) {

        // Pattern pattern =
        // Pattern.compile(console.readLine("%nEnter your regex: "));

        // Matcher matcher =
        // pattern.matcher(console.readLine("Enter input string to search: "));

        // boolean found = false;
        // while (matcher.find()) {
        // console.format("I found the text" +
        // " \"%s\" starting at " +
        // "index %d and ending at index %d.%n",
        // matcher.group(),
        // matcher.start(),
        // matcher.end());
        // found = true;
        // }
        // if(!found){
        // console.format("No match found.%n");
        // }
        // }

        // calls the login controller
        LoginController lc = new LoginController();

        // faculty uploading grade
        // 1. FACULTY, facIST123, 1, 4

        // faculty send email
        // 2. FACULTY, facIST123, 2, 1

        // faculty quit
        // 3. FACULTY, facIST123, 3

        // student submitting
        // 4. STUDENT, stud123, 1, 1

        // student changing assignment list view
        // 5. STUDENT, stud123, 1, 2

    }
}
