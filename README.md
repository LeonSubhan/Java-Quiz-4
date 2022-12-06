# Java-Quiz-4

question #1

Create a class IzaanSchool with following private instance variables:

fullName
 email
phoneNumber
course
role
fee
And following methods: 

setfullName(String fullName)
setEmail(String email)
setPhoneNumber(long phoneNumber)
setCourse(String course) : Course name can be only QA, DevOps, or Data Analyst. It will show message "Invalid course" if entered any other name. 
setRole(String role): Role can be only teacher or student. It will show message "Invalid role" if entered any other role. 
setFee(int fee): This method will as user to choose among plans like plan1, plan2 or plan3. If user choose plan1 set fee to $7200, if user choose plan2 set fee to $7600 and set fee to $8000 if user choose plan3. 
getfullName()
getEmail()
getPhoneNumber()
getCourse()
getRole()
getfee()

Question #2

Create a class Person with following instance variables and methods:

private String name;
private int age;
private int weight;
private int height;
Person(String name, int age, int weight, int height)
growOlder(): Add 2 years to age of person. 
Create a array list "persons" and read/get input from user to enter persons in list and entering an empty name will end the reading part.
Print the number of entered persons.
Print information of all persons.

Question #3

Create a maven project with following classes:
A class Student with following members: 

name
marks
Array list Subject
addSubject: This method will ask user to enter all subjects(English, Science, Math, Arts etc) in list and return list. 
totalSubjects: This method will return total number of subjects entered in the list. 
addMarks(): get marks from user and reduce 5 marks then print message "Keep working hard".
Class testStudent with following methods: 
titleOfSubjects(): It will test whether subject titles are same as defined in question or not.  (Expected titles: English, Science, Math, Arts)
totalSubjects(): It will test the subjects entered.
