package k2_MultiLevelInheritance;
    public class CalculatorBasic extends Calculator{
            public static void multiplication(int a, int b){// Static method
                   int c=a*b;
                   System.out.println("Multiplication of a*b= "+c);

            } public static void division(double a, double b){// Static method
               double d=a/b;
                    System.out.println("Division of a/b= "+d);
            }
            public static void main(String[] args) {
                System.out.println("Different Calculations:-");
                multiplication(10,20);  //Accessing the method from same class
                multiplication(80,7);  //Accessing the method from same class
                multiplication(22,40);  //Accessing the method from same class
                division(10d,6d);    //Accessing the method from same class
                division(55,7);    //Accessing the method from same class
                division(440,3);    //Accessing the method from same class
                System.out.println("               ");
                System.out.println("Data derived from Calculator Class");
                Calculator calculator=new Calculator(); /*Object created to get data from Calculator class as
                  in Calculator class non-static/instance method  is used so we cant get data directly */
                calculator.addition(20,30);
                calculator.subtraction(30,10);
        }}
