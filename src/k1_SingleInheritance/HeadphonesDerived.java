    package k1_SingleInheritance;
        public class HeadphonesDerived extends HeadphonesBase {
            static String texture= "Matte";
            public static boolean bluetooth(boolean b){//Return type method
                b=true;
                return b;
            }
            public static void main(String[] args) {
                System.out.println("My Headphones");
                System.out.println("Brand: "+brand);//derived from Base class
                System.out.println("Color: "+ color);//derived from Base class
                System.out.println("Quality is good: "+goodQuality);//derived from Base class
                System.out.println("Texture: "+texture);// obtained from same class
                System.out.println("It can connects via bluetooth:"+bluetooth(true));
                //obtained data from the same class
                System.out.println("      ");
                System.out.println("Methods Derived from Base Class:");
                listeningMusic();// derived from Base class
                attendMeeting(); //derived from Base class
            }
        }
