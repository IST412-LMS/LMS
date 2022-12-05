package learningmanagementsystem.Authentification;

import java.util.HashMap;

public class PeopleList {
    private HashMap<Integer, String> peopleList = new HashMap<Integer, String>();

    public HashMap<Integer, String> PeopleList() {
        // hard coded values for now
        // add to peopleList
        peopleList.put(1, "Lewis Capaldi");
        peopleList.put(2, "Justin Bieber");
        peopleList.put(3, "Taylor Swift");
        peopleList.put(4, "Selena Gomez");
        peopleList.put(5, "Miley Cyrus");
        peopleList.put(6, "Harry Styles");

        return peopleList;
    }

    public String getPerson(HashMap<Integer, String> PeopleList, Integer i) {
        System.out.println("get person: " + peopleList.get(i));
        return peopleList.get(i);
    }
}
