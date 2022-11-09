package learningmanagementsystem.Authentification;

import learningmanagementsystem.Authentification.Person;

public class FacultyMgmtController {
    public FacultyInterface fi;

    public FacultyMgmtController(Person user) {
        // make faculty interface
        this.fi = new FacultyInterface();
        fi.initComponents(user);
        fi.setVisible(true);
    }
}
