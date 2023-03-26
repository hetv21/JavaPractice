package f_NonAccessModifiers;

public class StaticMethod {
    public static void main(String[] args) { // Main method

        System.out.println("program starts.\n");
        printMyAddress();  //Static method can be directly called in main method using method name
        System.out.println("program ends.");
    }
    public static void printMyAddress(){
        //Static method can be directly called in main method using method name
        System.out.println("Ashridge drive," + " South Oxhey,"+ " WD19 6TL");
    }
    }

