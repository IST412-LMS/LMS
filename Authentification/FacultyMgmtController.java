package learningmanagementsystem.Authentification;

import learningmanagementsystem.Authentification.Person;

public class FacultyMgmtController {
    public FacultyInterface fi;

    public FacultyMgmtController(Person p1) {
        this.fi = new FacultyInterface();
        fi.setVisible(true);
    }
}
