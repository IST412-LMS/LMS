/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package learningmanagementsystem.Assignments;

import java.util.HashMap;

public class AssignmentList {
    private HashMap<String, Integer> assignmentList = new HashMap<String, Integer>();

    public HashMap<String, Integer> AssignmentList() {
        // hard coded values for now
        assignmentList.put("Assignment 1", 100);
        assignmentList.put("Assignment 2", 90);
        assignmentList.put("Assignment 3", 100);
        assignmentList.put("Assignment 4", 75);
        assignmentList.put("Assignment 5", 100);

        return assignmentList;
    }

    public Integer getPoints(String name) {
        return assignmentList.get(name);
    }

    public void setPoints(String name, Integer points) {
        Integer oldValue = getPoints(name);
        assignmentList.replace(name, oldValue, points);
    }
}
