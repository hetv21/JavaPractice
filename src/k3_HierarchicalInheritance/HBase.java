        package k3_HierarchicalInheritance;
          //one superclass and multiple subclasses
        //HBase is superclass and H1 & H2 are subclasses
        public class HBase {
            static String familyName ="Smith";
            static String location="St George's drive";
            public static void parentName(String name){
                System.out.println(name);
            }
            public static void main(String[] args) {
                System.out.print("Mum's name: ");
                parentName("Daisy");
                System.out.println("Family name is: "+familyName);
                System.out.println("Resides at:"+location);
            }
        }
