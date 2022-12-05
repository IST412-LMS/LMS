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
    ArrayList<String> personAL = new ArrayList<String>();
    HashMap<Integer, String> personHM = new HashMap<>();

    public void initComponents(Person user, HashMap<Integer, String> newPersonHM) {
        setTitle("People Interface");
        setSize(600, 350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        instrumentPanel = new JPanel(new GridLayout(5, 1));
        instrumentPanel.add(new JLabel("Welcome to People List"));
        instrumentPanel.add(new JLabel("Here are the students in your class: "));

        if (newPersonHM == null) {
            System.out.println("null list");
            personHM = people.PeopleList();
        } else {
            personHM = newPersonHM;
        }

        System.out.println("people interface: " + newPersonHM.get(1));

        for (int i = 1; i < 6; i++) {
            String newPerson = newPersonHM.get(i);
            personAL.add(newPerson);
            System.out.println(newPerson);
        }

        Object[] assignStrings = personAL.toArray();
        JComboBox assignDropdown = new JComboBox(assignStrings);

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
        instrumentPanel.add(assignDropdown);

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
