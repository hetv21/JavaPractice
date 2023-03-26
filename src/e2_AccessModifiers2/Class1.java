package e2_AccessModifiers2;

import e1_AccessModifiers1.ClassA;
public class Class1 { //static variable- public modifier-visible to everyone
   static String hobby = " loves playing piano";
   static String hobby1 = "loves playing football";

   public static void main(String[] args) {
      ClassA myObj1 = new ClassA();   //object created to call data from different package
      Class4 myObj2 = new Class4();  //object creation to get data from diff class and same package
      System.out.println(myObj1.student + hobby +" & " + myObj1.student+ " likes studying:" +myObj2.likesStudying);
                   //called student name from different package
      System.out.println(myObj1.student1 + hobby +" & "+ myObj1.student1+ " likes studying:" +myObj2.likesStudying);

   }
}
