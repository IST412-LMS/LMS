# Learning Management System

## Authentification

The system starts with authentification. If a user is authenticated as a faculty they can see the assignment evaluation and communication methods. If a user is authenticated as a student they can see the assignment submision and communication methods.

## Use Case #1 - Communication

The system allows users to communicate via email. Although we don't actually have it hooked up to an email API, when an email is sent it is added to a file. This file then can be read if the user wants to see sent emails. A second file for recieved emails can also be read. In order to test communication use either the faculty or student login (FACULTY, facIST123 or STUDENT studIST123). Then choose 'Communication'. From here you can send emails, read the sent ones, or read the recieved ones.

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
