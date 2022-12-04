package learningmanagementsystem.Assignments;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import learningmanagementsystem.Authentification.*;

public class AssignmentDetailsInterface extends JFrame implements ActionListener {
    JPanel buttonPanel;
    JPanel instrumentPanel;
    final JTextField commentTextField = new JTextField(15);
    JTable j;

    public void initComponents(Person user) {
        // navigation tabs
        setTitle("Assignment Details Interface");
        setSize(600, 350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        instrumentPanel = new JPanel(new GridLayout(4, 1));
        instrumentPanel.add(new JLabel("Welcome to the Assignment Details"));
        instrumentPanel.add(new JLabel("Here is the list of Assingments: "));

        // TODO ADD HARDCODED ASSIGNMENTS
        String[][] data = {
                { "Assignment 1", "40", "November 7th", "Read a book" },
                { "Assignment 2", "100", "November 14th", "Write a summary" },
                { "Assignment 3", "100", "November 21st", "Write a report" },
                { "Assignment 4", "100", "November 28th", "Create a presentation" },
                { "Assignment 5", "100", "December 5th", "Present presentation" }
        };

        // Column Names
        String[] columnNames = { "Assignment", "Points", "Due Date", "Description" };

        // Initializing the JTable
        j = new JTable(data, columnNames);
        j.setBounds(30, 40, 200, 1000);

        // adding it to JScrollPane
        JScrollPane sp = new JScrollPane(j);
        instrumentPanel.add(sp);

        buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));

        JButton backButton = new JButton("Return to Home");

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StudentInterface si = new StudentInterface();
                si.initComponents(user);
            }
        });

        buttonPanel.add(backButton);

        getContentPane().add(instrumentPanel, BorderLayout.CENTER);
        getContentPane().add(buttonPanel, BorderLayout.SOUTH);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "problem");
    }
}
