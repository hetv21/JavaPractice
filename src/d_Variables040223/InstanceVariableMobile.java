package d_Variables040223;
public class InstanceVariableMobile {
    String mobName = "Apple Iphone";             //Variable -State/field/members
    String color = "Blue";
    Byte model = 14;
    short weight = 172;
    int capacity = 512;
    long price =799;
    float height = 146.7f;
    public void browsing(){   //behaviour/method
        System.out.println("Any set of information is available through browsing in this device."); }
    public void storingData() {
        System.out.println("It provides a good memory storage."); }
    public void clickingPics(){
        System.out.println("It has very good resolution which gives quality pictures. ");  }

    public static void main(String[] args) {
    InstanceVariableMobile myPhone = new InstanceVariableMobile(); /*Creating an Object-
        Class name Object name = new Classname ();       */

        System.out.println("Model & color:-> "+myPhone.mobName+" "+myPhone.model+" "+"("+myPhone.color+")");
                                                                              // Object.variable
        System.out.println("Storage Capacity:-> "+myPhone.capacity+" GB");   // Object.variable
        System.out.println("Weight:-> "+myPhone.weight+" grams");           // Object.variable
        System.out.println("Cost:-> £"+myPhone.price+".00");               // Object.variable
        System.out.println("Height:-> "+myPhone.height+"mm");             // Object.variable

        String mobName = myPhone.mobName;                       // Reassigning data type
        System.out.println(mobName);

        myPhone.browsing();                                    // Object.my method
        myPhone.clickingPics();                               // Object.my method
        myPhone.storingData();                               // Object.my method
    }
}
