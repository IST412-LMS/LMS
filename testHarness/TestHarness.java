/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package learningmanagementsystem.testHarness;

import learningmanagementsystem.Authentification.LoginController;

/**
 *
 * @author hkgob
 */
public class TestHarness {
    public static void main(String[] args) {
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
