# Learning Management System

## Authentification

The system starts with authentification. If a user is authenticated as a faculty they can see the assignment evaluation and communication methods. If a user is authenticated as a student they can see the assignment submision and communication methods.

## Use Case #1 - Communication

The system allows users to communicate via email. Although we don't actually have it hooked up to an email API, when an email is sent it is added to a file. This file then can be read if the user wants to see sent emails. A second file for recieved emails can also be read. In order to test communication use either the faculty or student login (FACULTY, facIST123 or STUDENT studIST123). Then choose 'Communication'. From here you can send emails, read the sent ones, or read the recieved ones.

## Use Case #2 - Assignment Grading

The system allows for someone with a Faculty login to edit an assignment grade. This works by using a text field to take user input on the AssignmentViewingInterface and save it to the hashmap that holds the assignments. In order to test grading use the faculty login (FACULTY, facIST123). Then choose 'Assignment Grading'. From here you can select an assigment and choose 'View Selected Assignment'. Change the text field and press 'Grading'. You should see the page reload and the grade change to what your input was.

## Use Case #3 - Assignment Submission

The system allows for someone with a Student login to post an assignment. This works by using a text field to take user input on the AssignmentSubmissionInterface and save it to the arraylsit that holds the submissions. In order to test submissions use the student login (STUDENT, studIST123). Then choose 'Submission'. From here you can add your submission to the text box. If you change the text field and press 'Submit' it will save and you will see it in the past submissions page.

## Use Case #4 - Roster Interface

The system allows for the professor to view the list of students in his class. This works by printing the details of the class list. In order to test this use the FACULTY login (FACULTY, facIST123). Then choose the 'Roster' button. From here you can view the whole list.

## Use Case #5 - Assignment Details

The system allows for anyone to view the list of assignment deatils. This works by printing the details of the assignment list. In order to test this use the either login (FACULTY, facIST123; STUDENT, studIST123). Then choose the 'Details' button. From here you can view the whole list with lots of details.

## Implementations Phase Contributions Sheet
https://docs.google.com/document/d/1ASXrsMisGaUJHUlEyLyWn9KO6qq_PHV9t07-GFLjzWQ/edit?usp=sharing
<br><br>
Madison Borkovich: 20%
<br>
Completed writing assignments
<br><br>
Nicole Davey: 30%
<br>
Completed writing assignments and fourth use case
<br><br>
Hannah Kern: 50%
<br>
Completed some of the writing assignments and most of the code


## Refactoring Plan

Madison was in charge of our refactoring plan. She took care of the dispensables and a few bloaters that we found in our code. Below are a list of code changes that needed made that were taken care of.

### Coupler

The faculty management controller and student controller are middle men. They are not used other than to call the interfaces. In the future we can either try to make these more useful or get rid of them because they slow down the system.

### Bloater

Our inbox controller is a large class. We have only three methods but they are very long. It takes over 100 lines of code. It may be better to split into sub classes. This will make the code more readable and easier to follow.

### Dispensable

The Student and Faculty classes are never used in our system. We set them up but decided to use the verify user method inside of the person class instead. Eventually we may incorporate them again, but for now they are useless. They just slow down the processing speed.

### Dispensable

The extra methods in the person class aren’t used in our system. They were set up when we started but we don’t plan to integrate them into the system. Eventually we may want to set PSU ID numbers or allow for password updates, but right now that is not very necessary. The one we do use a lot is verify user. This slows down the processing speed.

### Dispensable

Repetition of the navigation tabs is unnecessary, especially that the tabs have been integrated into the interface. This can slow down the system’s processing and runtime, as well as create confusion among developers. Our example is the Tabs class (or Tabs.zip on Github.)

## Navigation

We are currently working on a process for navigation but have run into a few hiccups. For now it works but if you are in the inbox, instead of returning to the faculty or student home, you have to re login. When we finish our design patterns, we will have a chain of responsibility that should send the user through every interface. This will make sure we are returning to the previoud page.

## User Interface Design Patterns

One of the user interface design patterns is autocomplete. You can find this in the communication section of the program. Whenever a user types in the first two letters of a recipient email such as 'ha' the email 'hannah.kern@gmail.com' will be shown. Then the user can select tab and the email is input.

## Tabs Design Pattern

One of the user interface design patterns is tabs. You can find this after the login screen. Here, users are able to navigate back to login, or proceed to communication, which is more fleshed out, or to grading, which our team still must implement.

## Object Oriented Design Patterns

We have included three different object oriented design patterns. The first is chain of responsibilty. This means that whenever the system gets a command it passes it through multiple interfaces. We included this pattern in the navigation system. A users login information is saved and sent through multiple interfaces. This means that when they hit the communication screen, if they want to go back, they can return to the appropriate interface. This would be either faculty interface or student interface.

## Old Methods

- The assignment list shows a list of assignments and allows to select specific assignments
- The assignment class includes grading, uploading, viewing and submitting
- Assignemnt Submission includes assignment list, submit assignment, and view assignment
- Communications includes inbox with methods check inbox and send mail

## Testing

- There are four use cases to test the methods
- You can find them in TestHarness.java or below

         1. faculty uploading grade
         2. faculty send email
         3. faculty quit
         4. student submitting

![image](https://user-images.githubusercontent.com/54961655/194892456-7f54da67-cb8e-4565-99e4-01b037ea5099.png)
