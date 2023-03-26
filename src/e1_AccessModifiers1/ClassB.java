package e1_AccessModifiers1;
public class ClassB { // private modifier-can only be accessed within the class
                     // - Static variable used
    private static float percent = 97.88f;
    private static float percent1 = 36.98f;

    public static void main(String[] args) {
        ClassA myObjB = new ClassA();  /* to obtain students name from classA I have created
                   Object myObjB for classB - Student names were given using public modifier in classA
                   which is visible to everyone*/
        System.out.println(myObjB.student+ " got "+ percent+ "%");
        System.out.println(myObjB.student1+ " got "+ percent1+ "%");
    }
}

