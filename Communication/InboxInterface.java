package learningmanagementsystem.Communication;

import java.util.ArrayList;
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

import learningmanagementsystem.Authentification.FacultyInterface;
import learningmanagementsystem.Authentification.LoginInterface;
import learningmanagementsystem.Authentification.Person;
import learningmanagementsystem.Authentification.StudentInterface;

public class InboxInterface extends JFrame implements ActionListener {
    final JTextField recipientTextField = new JTextField(15);
    final JTextField messageTextField = new JTextField(15);

    JPanel buttonPanel;
    JPanel instrumentPanel;

    public void initComponents(Person user) {
        // navigation tabs
        setTitle("Inbox Interface");
        setSize(600, 350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // this.setResizable(false);
        // this.setLayout(null);

        instrumentPanel = new JPanel(new GridLayout(5, 1));
        instrumentPanel.add(new JLabel("Welcome to the inbox. Select Functionality:"));
        instrumentPanel.add(new JLabel("Enter Recipient:"));
        instrumentPanel.add(recipientTextField);
        instrumentPanel.add(new JLabel("Enter Message:"));
        instrumentPanel.add(messageTextField);

        String COMMIT_ACTION = "commit";

        // Without this, cursor always leaves text field
        recipientTextField.setFocusTraversalKeysEnabled(false);

        // Our words to complete
        ArrayList<String> users = new ArrayList<String>(5);
        users.add("madison.borkovitch@gmail.com");
        users.add("nicole.davey@gmail.com");
        users.add("hannah.kern@gmail.com");
        users.add("abc@gmail.com");
        Autocomplete autoComplete = new Autocomplete(recipientTextField, users);
        recipientTextField.getDocument().addDocumentListener(autoComplete);

        // Maps the tab key to the commit action, which finishes the autocomplete
        // when given a suggestion
        recipientTextField.getInputMap().put(KeyStroke.getKeyStroke("TAB"), COMMIT_ACTION);
        recipientTextField.getActionMap().put(COMMIT_ACTION, autoComplete.new CommitAction());

        buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));

        JButton sendButton = new JButton("Send Email");
        JButton readSentButton = new JButton("Read Sent Emails");
        JButton readRecievedButton = new JButton("Read Recieved Emails");
        JButton backButton = new JButton("Return to home");

        sendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                InboxController ic = new InboxController();

                String recipient = recipientTextField.getText();
                String message = messageTextField.getText();

                ic.SendEmail(recipient, message);
                JOptionPane.showMessageDialog(null, "Email sent.");
            }
        });

        readSentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("read sent clicked");
                InboxController ic = new InboxController();
                ArrayList<String> results = ic.ReadSentEmail();

                ReadEmailsInterface rei = new ReadEmailsInterface();
                rei.initComponents(results, user);
                rei.setVisible(true);
            }
        });

        readRecievedButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("read recieved clicked");
                InboxController ic = new InboxController();
                ArrayList<String> results = ic.ReadRecievedEmail();

                ReadEmailsInterface rei = new ReadEmailsInterface();
                rei.initComponents(results, user);
                rei.setVisible(true);
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

        buttonPanel.add(sendButton);
        buttonPanel.add(readSentButton);
        buttonPanel.add(readRecievedButton);
        buttonPanel.add(backButton);

        getContentPane().add(instrumentPanel, BorderLayout.CENTER);
        getContentPane().add(buttonPanel, BorderLayout.SOUTH);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        JOptionPane.showMessageDialog(null, "Notice: Entered event listener wrong....");
    }
}
