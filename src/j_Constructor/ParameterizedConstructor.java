            package j_Constructor;
            public class ParameterizedConstructor {/*Constructor overloading- It means developing
            multiple constructor in same class with same name but variation in argument list*/
                ParameterizedConstructor(int x)
                { // Constructor with 1 parameter
                    System.out.println(" My First Constructor.");
                }
                ParameterizedConstructor(int x, double y){
                 //Constructor with 2 parameters
                    System.out.println(" My Second Constructor.");
                }
                ParameterizedConstructor(int x, char y, double d){ //Constructor with 3 parameters
                    System.out.println(" My Third Constructor.");
                }
                public static void main(String[] args) {
                    System.out.println("***Constructor Overloading**");
                    System.out.println("'Occurrence of argument can vary,Data type and length can vary too'");
                    ParameterizedConstructor parameterisedConstructor= new ParameterizedConstructor(40);
                    //object created-prints my first constructor
                    new ParameterizedConstructor(20);// Prints-my first constructor
                    new ParameterizedConstructor(10,'y',20.504);// my third C
                    new ParameterizedConstructor(20,30.5067);//my second C
                }}
