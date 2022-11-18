package learningmanagementsystem.Assignments;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import learningmanagementsystem.Authentification.*;

public class AssignmentViewingInterface extends JFrame implements ActionListener {
    JPanel buttonPanel;
    JPanel instrumentPanel;
    final JTextField gradeTextField = new JTextField(15);
    AssignmentList assignments = new AssignmentList();
    ArrayList<String> assignAL = new ArrayList<String>();
    HashMap<Integer, Assignment> assignHM = assignments.AssignmentList();

    public void initComponents(Person user, Assignment selectedAssignment) {
        // navigation tabs
        setTitle("Assignment Viewing Interface");
        setSize(600, 350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        instrumentPanel = new JPanel(new GridLayout(5, 1));
        instrumentPanel.add(new JLabel("Welcome to the Assignment. Here the information you requested"));

        instrumentPanel.add(new JLabel("The assignment is: " + selectedAssignment.getName()));
        instrumentPanel.add(new JLabel("The current grade is: " + selectedAssignment.getPoints()));

        buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));

        LoginInterface li = new LoginInterface();

        int result = user.verifyUser(li);
        switch (result) {
            case 1:
                JButton gradeButton = new JButton("Grade Assignment");
                buttonPanel.add(gradeButton);

                instrumentPanel.add(new JLabel("Enter New Grade:"));
                instrumentPanel.add(gradeTextField);

                gradeButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String newGrade = gradeTextField.getText();
                        assignHM = assignments.setAssignmentGrade(assignHM, selectedAssignment, newGrade);
                        AssignmentViewingInterface avi = new AssignmentViewingInterface();
                        System.out.println("selected assignment points @grade button before return"
                                + selectedAssignment.getPoints());
                        Assignment checkingAss = assignHM.get(1);
                        Assignment checkingAss2 = assignHM.get(2);
                        System.out.println("assignHM points @grade button before return " + checkingAss.getPoints()
                                + checkingAss2.getPoints());
                        avi.initComponents(user, selectedAssignment);
                    }
                });
                break;
            case 2:
                JButton submitButton = new JButton("Submit Assignment");
                buttonPanel.add(submitButton);
                break;
            default:
                break;
        }

        JButton backButton = new JButton("Return to Assignment List");

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AssignmentInterface ai = new AssignmentInterface();
                ai.initComponents(user, assignHM);
            }
        });

        buttonPanel.add(backButton);

        getContentPane().add(instrumentPanel, BorderLayout.CENTER);
        getContentPane().add(buttonPanel, BorderLayout.SOUTH);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JComboBox cb = (JComboBox) e.getSource();
        String item = (String) cb.getSelectedItem();
        JOptionPane.showMessageDialog(null, "hey you changed the dropdown and chose " + item);
    }
}
