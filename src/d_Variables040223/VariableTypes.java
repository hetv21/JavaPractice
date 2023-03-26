package d_Variables040223;

public class VariableTypes {
    char initial = 'H';       // Global/Instance variable
    boolean skyIsBlue = true; //Global/Instance Variable
                             /*Declared inside class but outside main method
                               without using static keyword. Stored in heap memory.
                               It can be accessed by any method.
                               Memory will only be allocated when Object is created.
                               Memory will be released when Object is destroyed
                               Good approach for memory optimization */
    static byte number = 27; //Static Variable
    static float time = 17.55f; //Static variable
                               /* Declared inside a class but outside main method
                                  using a 'static' keyword. Stored in non heap Memory
                                  Not great practice*/


    public static void main(String[] args) {
        String info = " Types of variable"; //Local Variable

        int box = 4;             // Local Variable
                                 /* Declared inside the class and main method.
                                 Stored in stack memory. Memory will be allocated when method starts
                                 ,and it will release when method is completed*/ }
}

