package learningmanagementsystem.Authentification;

import javax.swing.*;

public class Tabs extends JFrame {
    public Tabs() {
        this.setTitle(("Navigation Tabs"));
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();

        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.setBounds(50, 50, 400, 400);

        tabbedPane.add("Courses", panel1);
        tabbedPane.add("Email/Message", panel2);
        tabbedPane.add("Assignment List", panel3);

        this.add(tabbedPane);
        this.setVisible(true);
    }
}
