package k2_MultiLevelInheritance;
public class CalculatorVeryAdv extends CalculatorBasic {
    public static void squareNumber(int a) {// Static method
        int n = a * a;
        System.out.println("Square of n= " + n);
    }
    public static void cubeNumber(int a) {// Static method
        int n = a * a * a;
        System.out.println("Cube of b= " + n);
    }
    public static void main(String[] args) {
        System.out.println("Advance Calculations");
        squareNumber(3); //calling method directly  as its static - Data from same class
        squareNumber(99);
        squareNumber(8);
        cubeNumber(2); //calling method directly  as its static - Data from same class
        cubeNumber(7);
        System.out.println("      ");
        System.out.println("Accessing data from CalculatorBasic class directly (Static)");
        multiplication(10,20);
        multiplication(50,20);
        division(20,5);
        division(90,7);
        System.out.println("          ");
        System.out.println("Accessing data from Calculator Class by creating Object (Instance)");
        Calculator c=new Calculator();// Object created as Instance method used in Calculator class
        c.addition(20,10);
        c.addition(990,10);
        c.subtraction(95,80);
        c.subtraction(35,8);
        c.subtraction(35,800);
    }
}