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

public class ReadEmailsInterface extends JFrame implements ActionListener {
    JPanel buttonPanel;
    JPanel instrumentPanel;

    public void initComponents(ArrayList<String> emailList) {
        // navigation tabs
        setTitle("Emails Interface");
        setSize(600, 350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        instrumentPanel = new JPanel(new GridLayout(5, 1));
        instrumentPanel.add(new JLabel("Welcome to the email list."));

        buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));

        JButton backButton = new JButton("Return to Inbox");

        for (String string : emailList) {
            System.out.println(string);
            instrumentPanel.add(new JLabel(string));
        }

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                InboxInterface ii = new InboxInterface();
                ii.initComponents();
                ii.setVisible(true);
            }
        });

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
