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

    public HashMap<Integer, Assignment> initComponents(Person user, Assignment selectedAssignment) {
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
                instrumentPanel.add(new JLabel("Enter New Grade:"));
                instrumentPanel.add(gradeTextField);
                break;
            case 2:
                JButton submitButton = new JButton("Submit Assignment");
                buttonPanel.add(submitButton);
                break;
            default:
                break;
        }

        JButton backButton = new JButton("Save & Return to Assignment List");

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AssignmentInterface ai = new AssignmentInterface();
                String newGrade = "ERROR";
                if (gradeTextField.getText() == "") {
                    System.out.println(gradeTextField.getText());
                    System.out.println("null");
                    newGrade = selectedAssignment.getPoints();
                } else {
                    System.out.println("not null");
                    System.out.println(gradeTextField.getText());
                    newGrade = gradeTextField.getText();
                }
                assignHM = assignments.setAssignmentGrade(assignHM, selectedAssignment, newGrade);
                Assignment checkingAss = assignHM.get(1);
                Assignment checkingAss2 = assignHM.get(2);
                Assignment checkingAss3 = assignHM.get(3);
                Assignment checkingAss4 = assignHM.get(4);
                Assignment checkingAss5 = assignHM.get(5);
                System.out.println("returning list: " + checkingAss.getPoints() + " and "
                        + checkingAss2.getPoints() + " and "
                        + checkingAss3.getPoints() + " and "
                        + checkingAss4.getPoints() + " and "
                        + checkingAss5.getPoints());
                ai.initComponents(user, assignHM);
            }
        });

        buttonPanel.add(backButton);

        getContentPane().add(instrumentPanel, BorderLayout.CENTER);
        getContentPane().add(buttonPanel, BorderLayout.SOUTH);

        this.setVisible(true);

        return assignHM;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JComboBox cb = (JComboBox) e.getSource();
        String item = (String) cb.getSelectedItem();
        JOptionPane.showMessageDialog(null, "hey you changed the dropdown and chose " + item);
    }
}
