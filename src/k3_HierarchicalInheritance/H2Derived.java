    package k3_HierarchicalInheritance;
    public class H2Derived extends HBase {
        static String child2="Yvette";
        public static void child2 (){
            System.out.println(child2);
        }
        public static void main(String[] args) {
            System.out.print("Daughter's name is ");//obtained from same class
            child2();//obtained from same class
            System.out.println("       ");
            System.out.println("Below data is derived from Base class:");
            parentName("Mum's name is Daisy");//Derived from Base class
            System.out.println("Family name: "+familyName);
            System.out.println(location);//Derived from Base class
        }}


