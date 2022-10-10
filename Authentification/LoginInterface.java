package learningmanagementsystem.Authentification;

import java.util.Scanner;

public class LoginInterface {
    public LoginInterface(){

    }
    public Person Login(){
        Scanner mScan = new Scanner(System.in);
        System.out.println("Enter Login: ");
        String login = mScan.next();
        System.out.println("Enter Password: ");
        String pwd = mScan.next();
        Person p = new Person(login, pwd);
        return p;
    }
}
