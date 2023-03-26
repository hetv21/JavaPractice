package j_Constructor;
            public class DefaultConstructor { //Also called as Non parametrized Constructor
             //   int a;
             //   int b;
                public  DefaultConstructor(){//  default constructor created
                    int a = 20;
                    int b = 50;
                    int c = a + b;
                    int d= b-a;
                    System.out.println("This is default constructor");
                    System.out.println("Value of c= "+ c);
                    System.out.println("Value of d= "+d);
                    }
                    public static void main(String[] args) {
                    DefaultConstructor d=new DefaultConstructor();//Object created
                    }
                } /* Default constructor is called automatically once object is created
                unlike method*/

