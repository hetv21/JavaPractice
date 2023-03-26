package c_BodmasStatic280123;

public class LearningStatic {
    static char c = '9'; // Data type is char; Variable is c and the assigned value is 9
    static byte b = 127; // byte stores whole number from -128 to 127
    static short s = -32768; //short stores -32,768 to 32766
    static int i =2147483647; //woohoo you can store 10 digits number here
    static long l = 1_234_567_890_987_654_321L; // 19 digits - 64 bits
    static float f = 1334245.765f; // 32 bits range similar to int
    static float f2 = 1111111.451312F; //
    static double d = 1234567.54;// range is 64 bits
    static double d2 = 10001000.6454; // 64 bits similar to long
    static String abc = "Hello Everyone? Whats up,....334848fvk23e9dkd{:^^%$£ okay byeeeee.";
     /*sequence of characters can be stored here.
      you can add numbers,letters,symbols etc.
      Put them in double inverted commas and print in console*/

    public static void main(String[] args) {
        System.out.println("Datatype char is "+c);
        System.out.println("Datatype byte is "+b);
        System.out.println("Datatype short is:"+s);
        System.out.println("Datatype int is "+i);
        System.out.println("Datatype long is "+b);
        System.out.println("Datatype float is "+f);
        System.out.println("Datatype float is "+f2);
        System.out.println("Datatype double is "+d);
        System.out.println("Datatype double is "+d2);
        System.out.println("Data type String:" +abc);
    }
    }




