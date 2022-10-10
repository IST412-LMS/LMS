package learningmanagementsystem.Authentification;

import learningmanagementsystem.Authentification.Person;

import java.util.ArrayList;

public class Student extends Person {
    private String CollegeID;
    private String AdmitSemID;

    public Student(String login, String pwd){
        super(login, pwd);
    }
    public Student(String login, String pwd, String college, String admitsem){
        super(login, pwd);
        this.CollegeID = college;
        this.AdmitSemID = admitsem;
        }
}
