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
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import learningmanagementsystem.Authentification.*;

public class AssignmentInterface extends JFrame implements ActionListener {
    JPanel buttonPanel;
    JPanel instrumentPanel;
    AssignmentList assignments = new AssignmentList();
    ArrayList<String> assignAL = new ArrayList<String>();
    HashMap<Integer, Assignment> assignHM = new HashMap<>();

    public void initComponents(Person user, HashMap<Integer, Assignment> newAssignHM) {
        if (newAssignHM == null) {
            System.out.println("null list");
            assignHM = assignments.AssignmentList();
        } else {
            assignHM = newAssignHM;
        }

        // navigation tabs
        setTitle("Assignment Interface");
        setSize(600, 350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        instrumentPanel = new JPanel(new GridLayout(5, 1));
        instrumentPanel.add(new JLabel("Welcome to the Assignment List. Select an Assignment to take a closer look."));

        for (int i = 1; i < 6; i++) {
            Assignment newAssignment = assignments.getAssignment(assignHM, i);
            String newAssName = newAssignment.getName();
            assignAL.add(newAssName);
        }

        Object[] assignStrings = assignAL.toArray();

        JComboBox assignDropdown = new JComboBox(assignStrings);
        // assignDropdown.setSelectedIndex(2);

        buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));

        JButton selectButton = new JButton("View Selected Assignment");
        JButton backButton = new JButton("Return to Home");

        selectButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AssignmentViewingInterface avi = new AssignmentViewingInterface();
                Integer chosenAssignmentInt = assignDropdown.getSelectedIndex();
                String chosenAssignmentString = assignAL.get(chosenAssignmentInt);
                Assignment chosenAssignment = new Assignment("System error", "System error");
                for (int i = 1; i < assignAL.size(); i++) {
                    Assignment newAssignment = assignments.getAssignment(assignHM, i);

                    if (chosenAssignmentString == newAssignment.getName()) {
                        chosenAssignment = newAssignment;
                    }
                }
                System.out.println("chosen assignment points @select button " + chosenAssignment.getPoints());
                avi.initComponents(user, chosenAssignment);
            }
        });

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LoginInterface li = new LoginInterface();
                FacultyInterface fm;
                StudentInterface si;

                int result = user.verifyUser(li);
                switch (result) {
                    case 1:
                        fm = new FacultyInterface();
                        fm.initComponents(user);
                        fm.setVisible(true);
                        break;
                    case 2:
                        si = new StudentInterface();
                        si.initComponents(user);
                        si.setVisible(true);
                        break;
                    default:
                        break;
                }
            }
        });

        assignDropdown.addActionListener(this);
        instrumentPanel.add(assignDropdown);

        buttonPanel.add(selectButton);
        buttonPanel.add(backButton);

        getContentPane().add(instrumentPanel, BorderLayout.CENTER);
        getContentPane().add(buttonPanel, BorderLayout.SOUTH);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JComboBox cb = (JComboBox) e.getSource();
        String item = (String) cb.getSelectedItem();
        // JOptionPane.showMessageDialog(null, "hey you changed the dropdown and chose "
        // + item);
    }
}