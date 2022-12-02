package learningmanagementsystem.Assignments;

import java.util.ArrayList;

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

import learningmanagementsystem.Authentification.Person;

public class ViewSubmissionInterface extends JFrame implements ActionListener {
    JPanel buttonPanel;
    JPanel instrumentPanel;

    public void initComponents(ArrayList<String> submissionsList, Person user) {
        // navigation tabs
        setTitle("Emails Interface");
        setSize(600, 350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        instrumentPanel = new JPanel(new GridLayout(5, 1));
        instrumentPanel.add(new JLabel("Welcome to the submissions list."));

        buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));

        JButton backButton = new JButton("Return to Submissions");

        for (String string : submissionsList) {
            // System.out.println("init components:" + string);
            instrumentPanel.add(new JLabel(string));
        }

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AssignmentSubmissionInterface asi = new AssignmentSubmissionInterface();
                asi.initComponents(user);
                asi.setVisible(true);
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
