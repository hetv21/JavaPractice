package k2_MultiLevelInheritance;
    public class Calculator {
            public void addition(int a, int b){// Non-static/Instance
                int c;
                c=a+b;
                System.out.println("Addition of a+b= "+c);}
            public void subtraction(int a, int b){// Non-static
                int d;
                d=a-b;
                System.out.println("Subtraction of a-b= "+d);}

            public static void main(String[] args) {
                Calculator calculator=new Calculator(); // Object created
                System.out.println("Basic Calculations:-");
                calculator.addition(5, 15);
                calculator.addition(20, 2);
                calculator.addition(6, 19);
                calculator.subtraction(25, 7);
                calculator.subtraction(55, 9);
                calculator.subtraction(95, 8);

            }
    }
