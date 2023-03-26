package i_Array040323;
public class TypeCastingNarrowing {
        /*Narrowing typecasting- Manually converting one data type to another (larger to smaller)using parenthesis
        When we convert larger data size to smaller data size there will be loss of data hence
        this conversion doesn't happen automatically  */
        public static void main(String[] args) {
            double d= 3323245.45d; // 64 bits
            long l= (long) d;     //converting double to long(long-64 bits)
            int i = (int) (d+l);// i=d+1/ 3323245.45+3323245 (int- 32 bits)
            System.out.println("Example 1:");
            System.out.println("double value 'd'= "+d);
            System.out.println("long value 'l'= "+l);
            System.out.println("int value 'i'= "+ i +"  (i=d+l)");
            System.out.println("**********************************");
            long l1 = 222222L;   // size 64 bits
            int i1 = (int) l1;   // size 32 bits
            short s= (short) i1; // size 16 bits
            short s1= (short) l1;
            byte b= (byte) s;    // size 8 bits
            System.out.println("Example 2:");
            System.out.println("long value 'l1'= "+l1);
            System.out.println("int value 'i1'= "+i1 +"   (l1=i1)");
            System.out.println("short value 's'=" +s+"   (s=i1)");
            System.out.println("short value 's1'=" +s1+"   (s1=l1)");
            System.out.println("byte value 'b'= "+b);
            System.out.println("*********************************");
            int a = 101;
            char c= (char) a;
            System.out.println("Example 3:");
            System.out.println( "Value of int 'a'= "+ a);
            System.out.println("Value of char 'c'= "+c+" (c=a)");
            //ASCII value for 'e' is 101- character 'e' is printed in console
        }
    }
