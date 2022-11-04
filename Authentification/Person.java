package learningmanagementsystem.Authentification;

import java.util.Date;

public class Person {
    private String loginID;
    private String password;
    private Date pwdUpdateDate;
    private String Name;
    private String psuID;

    public Person(String login, String pwd) {
        this.loginID = login;
        this.password = pwd;
    }

    public void setPsuID(String psuID) {
        this.psuID = psuID;
    }

    public String getName() {
        return Name;
    }

    public int verifyUser(LoginInterface li) {
        if (loginID.equals("F") && password.equals("f")) {
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

    public void updatePassword() {
    };

    // Method 1 - Getter
    public String getLogin() {
        return this.loginID;
    }

    // Method 2 - Setter
    public void setLogin(String N) {
        // This keyword refers to current instance itself
        this.loginID = N;
    }

    // Method 1 - Getter
    public String getPassword() {
        return this.password;
    }

    // Method 2 - Setter
    public void setPassword(String N) {
        // This keyword refers to current instance itself
        this.password = N;
    }
}
