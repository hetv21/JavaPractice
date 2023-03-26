    package l1_Polymorphism;
        public class Overloading {
            //In same class -same method name- but diff data types-parameters
            public static void grades(String schoolName) {
                System.out.println("Name of the school: " + schoolName);
            }
                public static void grades(String className, char classDivision) {
                    System.out.println("Class "+className+ " (Division " +classDivision+")");
            }
            public static void grades(String name, int id,double grade) {
                System.out.println(name+" ("+ "id-"+ id+") scored "+ grade+"%");
            }

            public static void main(String[] args) {
                grades("Oak Hill School");
                System.out.println("***********************************");
                grades("Maple", 'A');
                grades("Harry",5,98.94);
                grades("Hermione",6,98.95);
                grades("Molly",7,94.44);
                System.out.println("     ");
                grades("Oak Hill School");
                grades("Spruce", 'B');
                grades("Albert",3,86.94);
                grades("Herman",4,88.95);
                grades("Sally",6,90.44);
        }}

