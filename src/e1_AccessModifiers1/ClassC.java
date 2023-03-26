package e1_AccessModifiers1;
public class ClassC { // protected modifier-visible to package & subclass
                     // Static variable used
    protected static boolean isHappyWithResult= true;
    protected static boolean isHappyWithResult1 = false;

    public static void main(String[] args) {
        ClassD myObjC = new ClassD(); // Obtained retry statement from classD by creating an object
        System.out.println("Deepa is happy with her result: " + isHappyWithResult);
        System.out.println("Andy is happy with his result: " + isHappyWithResult1+ ". "+ myObjC.retry);
    }
}
