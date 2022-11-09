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
import learningmanagementsystem.Communication.InboxController;
import learningmanagementsystem.Communication.InboxInterface;

public class FacultyInterface extends JFrame implements ActionListener {
    JPanel buttonPanel;
    JPanel instrumentPanel;

    public void initComponents(Person user) {
        // navigation tabs
        setTitle("Faculty Interface");
        setSize(600, 350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // this.setResizable(false);
        // this.setLayout(null);

        instrumentPanel = new JPanel(new GridLayout(5, 1));
        instrumentPanel.add(new JLabel("Welcome to Faculty Interface. Select Functionality:"));

        buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));

        JButton communicationButton = new JButton("Communication");
        JButton assignmentGradingButton = new JButton("Assignment Grading");
        JButton backButton = new JButton("Return to login");

        communicationButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // make inbox interface
                InboxInterface ii = new InboxInterface();
                ii.initComponents(user);
                ii.setVisible(true);
            }
        });

        assignmentGradingButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Notice: Selected grading.");
            }
        });

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LoginInterface li = new LoginInterface();
                li.initComponents();
                li.setVisible(true);
            }
        });

        // JPanel panel1 = new JPanel();
        // JPanel panel2 = new JPanel();

        // JTabbedPane tabbedPane = new JTabbedPane();
        // tabbedPane.setBounds(50, 50, 400, 400);

        // tabbedPane.add("Communication", panel2);
        // tabbedPane.add("Assignment Grading", panel1);

        // this.add(tabbedPane);
        buttonPanel.add(communicationButton);
        buttonPanel.add(assignmentGradingButton);
        buttonPanel.add(backButton);

        getContentPane().add(instrumentPanel, BorderLayout.CENTER);
        getContentPane().add(buttonPanel, BorderLayout.SOUTH);

        this.setVisible(true);
    }

    // public void OldFacultyInterface() {
    // System.out.println("Welcome to Faculty Interface");
    // System.out.println("Select Functionality:");
    // System.out.println("1. Assignment Grading ");
    // System.out.println("2. Communication");
    // System.out.println("3. Exit Application");

    // Scanner mScan = new Scanner(System.in);
    // int choice = mScan.nextInt();
    // boolean isGraded = false;
    // switch (choice) {
    // case 1:
    // // TODO go to gradebook
    // System.out.println("Here is the grading");
    // // check if assignment has been graded
    // if (isGraded == true) {
    // // immediately go to upload grade
    // Assignment assigUpload = new Assignment();
    // assigUpload.UploadGrade();
    // } else {
    // // open GradeAssignment
    // Assignment assig = new Assignment();
    // assig.GradeAssignment();
    // }
    // break;
    // case 2:
    // // TODO go to communication
    // System.out.println("Here is communication");
    // // InboxController inbox = new InboxController();
    // // inbox.CheckInbox();
    // break;
    // case 3:
    // return;
    // default:
    // break;
    // }
    // }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        JOptionPane.showMessageDialog(null, "Notice: Entered event listener wrong....");
    }
}
