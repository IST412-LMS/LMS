package learningmanagementsystem.Authentification;

import learningmanagementsystem.Authentification.Person;

public class FacultyMgmtController {
    public FacultyInterface fi;

    public FacultyMgmtController() {
        // make faculty interface
        this.fi = new FacultyInterface();
        fi.initComponents();
        fi.setVisible(true);
    }
}
