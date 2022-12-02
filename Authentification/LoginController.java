package learningmanagementsystem.Authentification;

import learningmanagementsystem.Authentification.StudentInterface;

public class LoginController {
    private Person p1;
    public LoginInterface li;

    public LoginController() {
        // make opening interface
        this.li = new LoginInterface();
        li.initComponents();
        li.setVisible(true);
    }

    public void submitClicked(Person p1) {
        li = new LoginInterface();
        FacultyInterface fm;
        StudentInterface si;
        int user = p1.verifyUser(li);
        switch (user) {
            case 1:
                li.setVisible(false);
                fm = new FacultyInterface();
                fm.initComponents(p1);
                fm.setVisible(true);
                break;
            case 2:
                li.setVisible(false);
                si = new StudentInterface();
                si.initComponents(p1);
                si.setVisible(true);
                break;
            default:
                break;
        }
    }
}
