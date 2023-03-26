package e1_AccessModifiers1;
public class ClassD { // default modifier- visible to package
                     //Instance variable used-Object creation needed
  String retry = "Andy has decided to resit his exam to get good result.";

    public static void main(String[] args) {
        ClassD myClassObject = new ClassD();
        System.out.println(myClassObject.retry);
    }
}
