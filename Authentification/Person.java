package learningmanagementsystem.Authentification;

import java.util.Date;

public class Person {
    private String loginID;
    private String password;
    private String Name;

    public Person(String login, String pwd) {
        this.loginID = login;
        this.password = pwd;
    }

    public String getName() {
        return Name;
    }

    public int verifyUser(LoginInterface li) {
        if (loginID.equals("FACULTY") && password.equals("facIST123")) {
            System.out.println("is a faculty");
            return 1;
        } else if (loginID.equals("STUDENT") && password.equals("studIST123")) {
            this.Name = loginID;
            System.out.println("is a student");
            return 2;
        } else {
            li.brokenPassword();
            return 0;
        }
    }
}
