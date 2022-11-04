package learningmanagementsystem.Authentification;

import learningmanagementsystem.Authentification.FacultyMgmtController;
import learningmanagementsystem.Authentification.StudentInterface;

public class LoginController {
    private Person p1;
    FacultyMgmtController fm;
    StudentInterface si;
    private LoginInterface li;

    public LoginController() {
        this.li = new LoginInterface();
        li.setVisible(true);
        p1 = li.LoginInterface();
        int user = p1.verifyUser(li);
        switch (user) {
            case 1:
                this.fm = new FacultyMgmtController(this.p1);
                break;
            case 2:
                this.si = new StudentInterface(this.p1);
                break;
            default:
                break;
        }
    }
}
