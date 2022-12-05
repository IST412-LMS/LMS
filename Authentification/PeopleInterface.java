package learningmanagementsystem.Authentification;

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

public class PeopleInterface extends JFrame implements ActionListener {
    JPanel buttonPanel;
    JPanel instrumentPanel;
    PeopleList people = new PeopleList();
    ArrayList<String> assignPL = new ArrayList<String>();
    HashMap<String, Person> assignHM = new HashMap<>();

    public void initComponents(Person user, HashMap<String, Person> newPersonHM) {
        if (newPersonHM == null) {
            System.out.println("null list");
            personHM = people.PeopleList();
        } else {
            personHM = newPersonHM;
        }

      


        Object[] person.toArray();

        buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));


        JButton backButton = new JButton("Return to Home");

      

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


       
        buttonPanel.add(backButton);

        getContentPane().add(instrumentPanel, BorderLayout.CENTER);
        getContentPane().add(buttonPanel, BorderLayout.SOUTH);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JComboBox cb = (JComboBox) e.getSource();
        String item = (String) cb.getSelectedItem();
       
    }
}
