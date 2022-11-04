/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package learningmanagementsystem;

import learningmanagementsystem.Authentification.LoginController;
import learningmanagementsystem.Authentification.Tabs;

/**
 *
 * @author hkgob
 */
public class LearningManagementSystem {

    public static void main(String[] args) {
        // authenticate
        // show the buttons choosen for authentication
        // if the user clicks assignment evaluation we show a gradebook
        // checks if the selected assignment has been graded
        // if yes show uplaod grade
        // if no show grade assignment
        // if the user clicks assignment submission we show assignment list
        // they can select an assignment and choose viewAssignment
        // from there they can submit
        // if the user clicks communication we show checkInbox
        // if they select edit, open a send email box
        LoginController lc = new LoginController();
    }
}
