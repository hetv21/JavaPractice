package e1_AccessModifiers1;

public class ClassA { //public modifier-Visible to everyone
                     // Instance variable used-will need object creation
    public String student = "Deepa";
    public String student1 = "Andy";

    public static void main(String[] args) {
    ClassA myObject = new ClassA(); // Object creation
        System.out.println("Student name: "+ myObject.student);
        System.out.println("Student name: "+ myObject.student1);
    }
}
