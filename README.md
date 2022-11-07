# Learning Management System

## Authentification

The system starts with authentification. If a user is authenticated as a faculty they can see the assignment evaluation and communication methods. If a user is authenticated as a student they can see the assignment submision and communication methods.

## Use Case #1 - Communication

The system allows users to communicate via email. Although we don't actually have it hooked up to an email API, when an email is sent it is added to a file. This file then can be read if the user wants to see sent emails. A second file for recieved emails can also be read. In order to test communication use either the faculty or student login (FACULTY, facIST123 or STUDENT studIST123). Then choose 'Communication'. From here you can send emails, read the sent ones, or read the recieved ones.

## Navigation

We are currently working on a process for navigation but have run into a few hiccups. For now it works but if you are in the inbox, instead of returning to the faculty or student home, you have to re login. When we finish our design patterns, we will have a chain of responsibility that should send the user through every interface. This will make sure we are returning to the previoud page.

## Methods

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
