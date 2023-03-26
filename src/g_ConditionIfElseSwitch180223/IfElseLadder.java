package g_ConditionIfElseSwitch180223;
public class IfElseLadder {
    public void checkGrades(int marks) { // Instance method created
            if (marks >= 0 && marks <= 34) {
                System.out.println("Student has failed.");
            } else if (marks >= 35 && marks <= 50) {
                System.out.println("Student got grade C");
            } else if (marks >= 51 && marks <= 60) {
                System.out.println("Student got grade B");
            } else if (marks >= 61 && marks <= 70) {
                System.out.println("Student got grade A");
            } else if (marks >= 71 && marks <= 80) {
                System.out.println("Student got grade A*");
            } else if (marks >= 81 && marks <= 90) {
                System.out.println("Student got grade A**");
            } else if (marks >= 91 && marks <= 100) {
                System.out.println("Student got grade A***");
            } else {
                System.out.println("Invalid result.");}}

             public static void main(String[] args) {         // In main method
             IfElseLadder ifElseLadder = new IfElseLadder(); // Object created- (ifElseLadder)

                 ifElseLadder.checkGrades(100);      // calling method using object.
                 ifElseLadder.checkGrades(81);
                 ifElseLadder.checkGrades(77);
                 ifElseLadder.checkGrades(67);
                 ifElseLadder.checkGrades(54);
                 ifElseLadder.checkGrades(45);
                 ifElseLadder.checkGrades(34);
                 ifElseLadder.checkGrades(-4);
                 ifElseLadder.checkGrades(103);
          }}


