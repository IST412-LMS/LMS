package learningmanagementsystem.Authentification;

import learningmanagementsystem.Authentification.FacultyMgmtController;
import learningmanagementsystem.Authentification.StudentInterface;

public class LoginController {
    private Person p1;
    FacultyMgmtController fm;
    StudentController si;
    public LoginInterface li;

    public LoginController() {
        // make opening interface
        this.li = new LoginInterface();
        li.initComponents();
        li.setVisible(true);
    }

    public void submitClicked(Person p1) {
        li = new LoginInterface();
        int user = p1.verifyUser(li);
        switch (user) {
            case 1:
                this.fm = new FacultyMgmtController(p1);
                break;
            case 2:
                this.si = new StudentController(p1);
                break;
            default:
                break;
        }
    }
}
