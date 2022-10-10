package learningmanagementsystem.Authentification;

import learningmanagementsystem.Authentification.Person;

public class Faculty extends Person {
    String collegeID;
    String RoleID;

    public Faculty(String login, String pwd) {
        super(login, pwd);
        }

    public void setCollegeID(String collegeID) {
        this.collegeID = collegeID;
        }

    public void setRoleID(String roleID) {
        RoleID = roleID;
        }
    public void assignCourseInstructor(String courseinstID){}

}
