package learningmanagementsystem.Assignments;

import java.util.Scanner;
import java.util.ArrayList;

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
    String[] assignStrings = { "Assignment 1", "Assignment 2", "Assignment 3", "Assignment 4", "Assignment 5" };

    public void initComponents(Person user) {
        // navigation tabs
        setTitle("Assignment Interface");
        setSize(600, 350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        instrumentPanel = new JPanel(new GridLayout(5, 1));
        instrumentPanel.add(new JLabel("Welcome to the Assignment List. Select an Assignment to take a closer look."));

        JComboBox assignList = new JComboBox(assignStrings);
        assignList.setSelectedIndex(4);

        buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));

        JButton backButton = new JButton("Return to Home");

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LoginInterface li = new LoginInterface();
                FacultyMgmtController fm;
                StudentController si;

                int result = user.verifyUser(li);
                switch (result) {
                    case 1:
                        fm = new FacultyMgmtController(user);
                        break;
                    case 2:
                        si = new StudentController(user);
                        break;
                    default:
                        break;
                }
            }
        });

        assignList.addActionListener(this);
        instrumentPanel.add(assignList);

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