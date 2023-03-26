package e2_AccessModifiers2;

import e1_AccessModifiers1.ClassA;

public class Class2 { //private modifier - visible to class only
    //static variable
    static private int mathsScore = 97;
    static private int mathsScore1 = 36;


    public static void main(String[] args) {
        ClassA myScoreObj = new ClassA();
        System.out.println(myScoreObj.student+" scored "+ mathsScore+ " " + "marks in Maths.");
        System.out.println(myScoreObj.student1+" scored "+ mathsScore+ " " + "marks in Maths.");
    }
}
