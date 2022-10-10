package learningmanagementsystem.Authentification;

import java.util.Date;

public class Person {
    private String loginID;
    private String password;
    private Date pwdUpdateDate;
    private String Name;
    private String psuID;

    public Person(String login, String pwd){
        this.loginID = login;
        this.password = pwd;
        }

    public void setPsuID(String psuID) {
        this.psuID = psuID;
        }

    public String getName() {
        return Name;
    }

    public int verifyUser(){
        if (loginID.equals("FACULTY") && password.equals("facIST123"))
            return 1;
        else if (loginID.equals("STUDENT") && password.equals("studIST123")){
            this.Name = loginID;
            return 2;
            }
        else return 0;
        }
    public void updatePassword(){};
}
