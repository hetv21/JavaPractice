package e2_AccessModifiers2;

public class Class4 {//protected modifier-visible to package & subclass
                     //Instance variable
    protected boolean likesStudying =true;

    public static void main(String[] args) {
        Class4 myStudyObject = new Class4();
        System.out.println("Deepa and Andy enjoys studying: " +myStudyObject.likesStudying);
    }
}
