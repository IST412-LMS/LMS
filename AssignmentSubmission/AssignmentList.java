/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package learningmanagementsystem.AssignmentSubmission;

/**
 * 1. shows assignments
* 2. allows toggle between calendar and list view
*/
public class AssignmentList {
    public AssignmentList(){
        boolean listView = true;
    
        //open GUI 
        System.out.println("Here is the assignment list");

        //onChange of toggle, toggle between calender and list view
        if(listView == true){
            //change view 
            //update boolean
            listView = false;
        }
        
        //onCLick of specific assignemnt
        ViewAssignment va = new ViewAssignment();
    }    
}
