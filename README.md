# Learning Management System

## Authentification
The system starts with authentification. If a user is authenticated as a faculty they can see the assignment evaluation and communication methods. If a user is authenticated as a student they can see the assignment submision and communication methods. 

## Use Case #1 - Communication
The system allows users to communicate via email. Although we don't actually haveit hooked up to an email API, when an email is sent it is added to a file. This file then can be read if the user wants to see sent emails. A second file for recieved emails can also be read.In order to test communication on the command line use either the faculty or student login. Then choose '#2 Communication'. From here you can send emails, read the sent ones, or read the recieved ones. 

## Navigation
We are currently working on a process for navigation but have run into a few hiccups. For now the command line can be used to get through the different functions. Below in the testing section you can find directions, or just follow the output on the terminal.

## Methods
- The assignment list shows a list of assignments and allows to select specific assignments
- The assignment class includes grading, uploading, viewing and submitting
- Assignemnt Submission includes assignment list, submit assignment, and view assignment
- Communications includes inbox with methods check inbox and send mail


## Testing
- There are five use cases to test the methods
- You can find them in TestHarness.java or below
- Each of the tasks list the input in order to reach the end and correctly test
- They also tell you what the output should be

        // 1. faculty uploading grade
        // FACULTY, facIST123, 1, 4
        // "Your grade has been uploaded"

        // 2. faculty send email
        // FACULTY, facIST123, 2, 1
        // "You have made it to the sendEmail page"

        // 3. faculty quit
        // FACULTY, facIST123, 3
        // program will quit

        // 4. student submitting
        // STUDENT, studIST123, 1, 1, 1
        // "You have made it to the submission page"

        // 5. student changing assignment list view
        // STUDENT, studIST123, 1, 2
        // "Changing view"

![image](https://user-images.githubusercontent.com/54961655/194892456-7f54da67-cb8e-4565-99e4-01b037ea5099.png)
