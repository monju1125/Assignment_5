# Assignment_5
Student Name : Md Monjurul Karim

                                                Problem Statement

PART 1: For Loops   

In your main() method, create a for loop that prints the numbers 10 down to 1. It must start with 10 and decrement down to 1.

PART 2: Arrays and Methods
1. Create a method called getStudents. Give the method a parameter called students that is an array of Strings. In the method, create a for loop that prints each student.
2. Next, in main() create an array of Strings called biologyStudents that contains the names of 4 students.
3. Create an additional array of Strings called javaStudents that contains the names of 3 students.
4. In main(), invoke the getStudents method and pass the biologyStudents array as the argument.
5. In main(), invoke the getStudents method and pass the javaStudents array as the argument.
   
BONUS (must be submitted before due date to receive): 2 points
Learning Management Systems such as Canvas contain student grade information. Let's mock this using what we've learned. Complete the following:
1. In your main() method create an array called advancedJavaStudents. This array should contain the names of the students in a classroom.
2. Create a separate array called grades. This should be an array of doubles containing the same number of values as the students array.
(For example, if there are 4 students, there should be 4 grades in the second array.)
Example Arrays:
students: {"Bob", "Fred", "Sultan", "Safa"}
grades: {3.4, 3.2, 4.0, 3.9}
3. Create a method called getStudentGrades. This method should take 3 parameters: a array of students, a array of grades, and an integer that represents the index value to retrieve. Use the integer passed to retrieve the corresponding student and their grade.
Example main() method:
String[] advancedJavaStudents = {"Bob", "Fred", "Sultan", "Safa"};
double[] grades = {3.4, 3.2, 4.0, 3.9}
getStudentGrades(advancedJavaStudents, grades, 2);
Given the above, the method should print "Sultan grade: 4.0"
This is because "Sultan" and the double 4.0 are at the index value 2, which is passed to the method.
