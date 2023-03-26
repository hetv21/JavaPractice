package e2_AccessModifiers2;
public class Class3 { //default modifier-visible to package only
                     // instance variable
    int age = 21;
    int age1 = 20;

    public static void main(String[] args) {
        Class3 myAgeObject = new Class3();
        System.out.println("Deepa is "+ myAgeObject.age+ " years old. "+"She"+ Class1.hobby);
        /*accessed class 1 data using class name as its static and
         concat age and hobby together in same sentence*/
        System.out.println("Andy is "+ myAgeObject.age1+ " years old. "+"He "+ Class1.hobby1);

    }
}
