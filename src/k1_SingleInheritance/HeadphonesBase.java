package k1_SingleInheritance;
        public class HeadphonesBase {// ex: Headphones
            static String brand= "JBL";
            static String color= "Black";
            static boolean goodQuality= true;
                public static void listeningMusic(){
                    System.out.println("Headphones can be used to listen music.");}
                public static void attendMeeting(){
                    System.out.println("I use my headphones when I attend meetings virtually.");}

                public static void main(String[] args) {
                    System.out.println("My Headphones");
                    System.out.println(brand);
                    System.out.println(color);
                    System.out.println("Quality is good= "+"so "+goodQuality);
                    listeningMusic();
                    attendMeeting();
                }
        }
