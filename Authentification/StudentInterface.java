package learningmanagementsystem.Authentification;

import learningmanagementsystem.Assignments.AssignmentList;
import learningmanagementsystem.Assignments.AssignmentSubmissionInterface;
import learningmanagementsystem.Communication.InboxController;
import learningmanagementsystem.Authentification.Tabs;

import java.util.HashMap;
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
import learningmanagementsystem.Assignments.AssignmentDetailsInterface;
import learningmanagementsystem.Assignments.AssignmentInterface;
import learningmanagementsystem.Communication.InboxInterface;

public class StudentInterface extends JFrame implements ActionListener {
    JPanel buttonPanel;
    JPanel instrumentPanel;

    public void initComponents(Person user) {
        // navigation tabs
        setTitle("Student Interface");
        setSize(600, 350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // this.setResizable(false);
        // this.setLayout(null);

        instrumentPanel = new JPanel(new GridLayout(5, 1));
        instrumentPanel.add(new JLabel("Welcome to Student Interface. Select Functionality:"));

        buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));

        JButton communicationButton = new JButton("Communication");
        JButton assignmentSubmissionButton = new JButton("Submissions");
        JButton assignmentDetailsButton = new JButton("Details");
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

        assignmentSubmissionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AssignmentSubmissionInterface newAssignment = new AssignmentSubmissionInterface();
                newAssignment.initComponents(user);
                newAssignment.setVisible(true);
            }
        });
        assignmentDetailsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AssignmentDetailsInterface newAssignment = new AssignmentDetailsInterface();
                newAssignment.initComponents(user);
                newAssignment.setVisible(true);
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
        buttonPanel.add(assignmentSubmissionButton);
        buttonPanel.add(assignmentDetailsButton);
        buttonPanel.add(backButton);

        getContentPane().add(instrumentPanel, BorderLayout.CENTER);
        getContentPane().add(buttonPanel, BorderLayout.SOUTH);

        this.setVisible(true);
    }

    public void OldStudentInterface(Person s1) {
        System.out.println("Welcome to Student Interface, " + s1.getName());
        System.out.println("Select Functionality:");
        System.out.println("1. Assignment Submissions ");
        System.out.println("2. Communication");
        System.out.println("3. Exit Application");

        Scanner mScan = new Scanner(System.in);
        int choice = mScan.nextInt();
        switch (choice) {
            case 1:
                // TODO go to submissions list
                System.out.println("Here is the assignment list");
                AssignmentList al = new AssignmentList();
                break;
            case 2:
                // TODO go to communication
                System.out.println("Here is communication");
                InboxController inbox = new InboxController();
                // inbox.CheckInbox();
                break;
            case 3:
                return;
            default:
                break;
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        JOptionPane.showMessageDialog(null, "Notice: Entered event listener wrong....");
    }
}
