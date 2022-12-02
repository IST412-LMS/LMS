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
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import learningmanagementsystem.Authentification.*;

public class AssignmentSubmissionInterface extends JFrame implements ActionListener {
    JPanel buttonPanel;
    JPanel instrumentPanel;
    final JTextField commentTextField = new JTextField(15);

    public void initComponents(Person user) {
        // navigation tabs
        setTitle("Assignment Submission Interface");
        setSize(600, 350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        instrumentPanel = new JPanel(new GridLayout(5, 1));
        instrumentPanel.add(new JLabel("Welcome to the Assignment Submissions"));
        instrumentPanel.add(new JLabel("Please write your submission below: "));
        instrumentPanel.add(commentTextField);

        buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));

        JButton submitButton = new JButton("Submit");
        JButton readButton = new JButton("View Past Submissions");
        JButton backButton = new JButton("Return to Home");

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String message = commentTextField.getText();
                try {
                    ArrayList<String> submissionsList = new ArrayList<String>();

                    FileReader fileReader = new FileReader("submissions.txt");
                    BufferedReader reader = new BufferedReader(fileReader);
                    String line;

                    while ((line = reader.readLine()) != null) {
                        // System.out.println("readbutton:" + line);
                        submissionsList.add(line);
                    }

                    reader.close();

                    FileWriter myWriter = new FileWriter("submissions.txt");
                    BufferedWriter bw = new BufferedWriter(myWriter);
                    String submission = "The submission is: " + message;
                    submissionsList.add(submission);

                    for (String item : submissionsList) {
                        bw.write(item);
                        bw.newLine();
                    }
                    bw.close();
                } catch (Exception exception) {
                    // TODO: handle exception
                    System.out.println("Error occured");
                }
                JOptionPane.showMessageDialog(null, "Submitted.");
            }
        });

        readButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayList<String> submissionsList = new ArrayList<String>();
                try {
                    FileReader fileReader = new FileReader("submissions.txt");
                    BufferedReader reader = new BufferedReader(fileReader);
                    String line;

                    while ((line = reader.readLine()) != null) {
                        // System.out.println("readbutton:" + line);
                        submissionsList.add(line);
                    }

                    reader.close();

                    ViewSubmissionInterface vsi = new ViewSubmissionInterface();
                    vsi.initComponents(submissionsList, user);
                    vsi.setVisible(true);
                } catch (Exception exception) {
                    submissionsList.add("Error occured");
                    System.out.println("Error occured");
                }
            }
        });

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StudentInterface si = new StudentInterface();
                si.initComponents(user);
            }
        });

        buttonPanel.add(submitButton);
        buttonPanel.add(readButton);
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
