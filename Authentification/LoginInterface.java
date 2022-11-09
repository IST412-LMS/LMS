package learningmanagementsystem.Authentification;

import java.util.Scanner;

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

public class LoginInterface extends JFrame implements ActionListener {
    final JTextField userNameTextField = new JTextField(15);
    final JTextField passwordTextField = new JTextField(15);

    JPanel instrumentPanel;
    JPanel buttonPanel;

    public void initComponents() {
        setTitle("Welcome to the Learning Management System");
        setSize(600, 350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        instrumentPanel = new JPanel(new GridLayout(5, 1));
        instrumentPanel.add(new JLabel("use either FACULTY, facIST123 or STUDENT, studIST123"));
        instrumentPanel.add(new JLabel("Enter Login"));
        instrumentPanel.add(userNameTextField);
        instrumentPanel.add(new JLabel("Enter Password"));
        instrumentPanel.add(passwordTextField);

        buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));

        JButton submitButton = new JButton("Submit");

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LoginController lc = new LoginController();
                // JOptionPane.showMessageDialog(null, "Notice: submit was clicked");
                // Boolean submitClicked = true;
                // submit(userNameTextField, passwordTextField);
                String username = userNameTextField.getText();
                String password = passwordTextField.getText();

                Person p = new Person(username, password);

                lc.submitClicked(p);
            }
        });

        buttonPanel.add(submitButton);

        setContentPane(new JPanel(new BorderLayout()));
        getContentPane().add(instrumentPanel, BorderLayout.CENTER);
        getContentPane().add(buttonPanel, BorderLayout.SOUTH);
    }

    // public void submit(JTextField userNameTextField, JTextField
    // passwordTextField) {
    // JOptionPane.showMessageDialog(null, "Notice: Selected submit.");
    // String username = userNameTextField.getText();
    // String password = passwordTextField.getText();

    // Person p = new Person(username, password);

    // LoginController.submitClicked(p);
    // }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        JOptionPane.showMessageDialog(null, "Notice: Entered event listener wrong....");
    }

    public void brokenPassword() {
        JOptionPane.showMessageDialog(null, "That username and password is incorrect");
    }
}
