package learningmanagementsystem.Authentification;

import learningmanagementsystem.Authentification.*;

public class StudentController {

    public StudentController(Person user) {
        // make faculty interface
        StudentInterface si = new StudentInterface();
        si.initComponents(user);
        si.setVisible(true);
    }

}
