package learningmanagementsystem.Authentification;

import java.util.Scanner;
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import learningmanagementsystem.Assignments.Assignment;
import learningmanagementsystem.Communication.Inbox;

public class FacultyInterface extends JFrame {
    public FacultyInterface() {
        initComponents();
    }

    private void initComponents() {
        // navigation tabs
        setTitle("Faculty Interface");
        setSize(600, 350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setResizable(false);
        this.setLayout(null);

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();

        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.setBounds(50, 50, 400, 400);

        tabbedPane.add("Communication", panel2);
        tabbedPane.add("Assignment Grading", panel1);

        this.add(tabbedPane);
        this.setVisible(true);
    }

    public void OldFacultyInterface() {
        System.out.println("Welcome to Faculty Interface");
        System.out.println("Select Functionality:");
        System.out.println("1. Assignment Grading ");
        System.out.println("2. Communication");
        System.out.println("3. Exit Application");

        Scanner mScan = new Scanner(System.in);
        int choice = mScan.nextInt();
        boolean isGraded = false;
        switch (choice) {
            case 1:
                // TODO go to gradebook
                System.out.println("Here is the grading");
                // check if assignment has been graded
                if (isGraded == true) {
                    // immediately go to upload grade
                    Assignment assigUpload = new Assignment();
                    assigUpload.UploadGrade();
                } else {
                    // open GradeAssignment
                    Assignment assig = new Assignment();
                    assig.GradeAssignment();
                }
                break;
            case 2:
                // TODO go to communication
                System.out.println("Here is communication");
                Inbox inbox = new Inbox();
                inbox.CheckInbox();
                break;
            case 3:
                return;
            default:
                break;
        }
    }
}
