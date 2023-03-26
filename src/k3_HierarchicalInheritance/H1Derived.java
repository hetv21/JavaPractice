    package k3_HierarchicalInheritance;
    public class H1Derived extends HBase{
        static String child1="John";
        public static void child1 (){
            System.out.println(child1);
        }
        public static void main(String[] args) {
            System.out.print("Son's name is ");//obtained from same class
            child1();
            System.out.println("       ");
            System.out.println("Below data is derived from Base class:");
         parentName("Mum's name is Daisy");//Derived from Base class
            System.out.println("Family name: "+familyName);
            System.out.println(location);//Derived from Base class
        }}
