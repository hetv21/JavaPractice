package d_Variables040223;
public class StaticVariableEquations {
    static String a = "Equations:- ";
    static String sum = "Sum: "; // Addition of 2 numbers
    static String diff = "Difference: "; // Subtraction of 2 numbers
    static String prod = "Product: "; // Multiplication of 2 numbers
    static String quot ="Quotient: "; // Division of one number by another

    public static void main(String[] args) {
        int x = 20;
        int y = 10;
        int z = x+y;
        int z1 = x-y;
        int z2 = x*y;
        int z3 = x/y;
        System.out.println(a);
        System.out.println(sum+z);     //z = x+y; should print x+y = 20+10 =30
        System.out.println(diff+z1);  //z1= x-y; should print x-y = 20-10 =10
        System.out.println(prod+z2);  //z1= x*y; should print x*y = 20*10 =200
        System.out.println(quot+z3);  //z1= x/y; should print x/y = 20/10 =2
    }}
