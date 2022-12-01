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
        instrumentPanel.add(commentTextField);

        buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));

        JButton submitButton = new JButton("Submit");
        JButton backButton = new JButton("Return to Home");

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // InboxController ic = new InboxController();

                // String message = commentTextField.getText();

                // ic.SendEmail(message);
                JOptionPane.showMessageDialog(null, "Submitted.");
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
