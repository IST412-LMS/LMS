/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package learningmanagementsystem.Assignments;

import java.util.HashMap;

public class AssignmentList {
    private HashMap<Integer, Assignment> assignmentList = new HashMap<Integer, Assignment>();

    public HashMap<Integer, Assignment> AssignmentList() {
        // hard coded values for now
        Assignment assign1 = new Assignment("100/100", "Assignment 1");
        Assignment assign2 = new Assignment("90/100", "Assignment 2");
        Assignment assign3 = new Assignment("75/100", "Assignment 3");
        Assignment assign4 = new Assignment("100/100", "Assignment 4");
        Assignment assign5 = new Assignment("100/100", "Assignment 5");

        // add to assignmentList
        assignmentList.put(1, assign1);
        assignmentList.put(2, assign2);
        assignmentList.put(3, assign3);
        assignmentList.put(4, assign4);
        assignmentList.put(5, assign5);

        return assignmentList;
    }

    public HashMap<Integer, Assignment> setAssignmentGrade(HashMap<Integer, Assignment> assignHM,
            Assignment changedAssignment, String newGrade) {
        for (int i = 1; i < assignHM.size(); i++) {
            Assignment newAssignment = assignHM.get(i);
            String newAssName = newAssignment.getName();
            System.out.println("newAssignemnt: " + newAssignment + " and new name: " + newAssName);

            String changedAssName = changedAssignment.getName();
            System.out.println("changed name: " + changedAssName);

            // check between changed assignment and current one in assignHM
            if (changedAssName == newAssName) {
                // update the assignHM
                assignHM.replace(i, changedAssignment);
                changedAssignment.setPoints(newGrade);
            }
        }

        return assignHM;
    }

    public Assignment getAssignment(HashMap<Integer, Assignment> assignmentList, Integer key) {
        // System.out.println("assignmentlist is: " + assignmentList.get(key));
        return assignmentList.get(key);
    }

    // public Integer getKey(Assignment assignment, HashMap<Integer, Assignment>
    // AssignmentList) {
    // //return assignmentList.get(assignment);
    // for(HashMap<Integer, Assignment> entry : AssignmentList.entrySet()) {
    // if (Objects.equals(assignment, entry.getAssignment())) {
    // return entry.getKey();
    // }
    // }
    // return null;
    // }

    // public void setPoints(String name, String points) {
    // Assignment replacement = new Assignment(points, name);
    // // Assignment oldAssignment = getKey();
    // assignmentList.replace(replacement);
    // }
}
