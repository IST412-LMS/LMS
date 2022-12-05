package learningmanagementsystem.Authentification;

import java.util.HashMap;

public class PeopleList {
    private HashMap<String, Person> peopleList = new HashMap<String, Person>();

    public HashMap<String, Person> PeopleList() {
        // hard coded values for now
        Person person1 = new Person("Learning Assistant", "Ryan Lewis");
        Person person2 = new Person("Teaching Assistant", "Justin Bieber");
        Person person3 = new Person("Student", "Taylor Swift");
        Person person4 = new Person("Student", "Selena Gomez");
        Person person5 = new Person("Student", "Miley Cyrus");

        // add to peopleList
        peopleList.put(1, person1);
        peopleList.put(2, person2);
        peopleList.put(3, person3);
        peopleList.put(4, person4);
        peopleList.put(5, person5);

        return peopleList;
    }


    public Assignment getPerson(HashMap<String, Person> PeopleList) {
        return peopleList.get();
    }
