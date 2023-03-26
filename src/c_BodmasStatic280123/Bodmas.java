package c_BodmasStatic280123;

public class Bodmas {//Bracket Order Division Multiplication Addition Subtraction

    public static void main(String[] args) {
        String bodmas = "This homework, I am practising BODMAS concept,inline documentation & concatenation.";
        String bodmas1 ="I have put 2 different forms of comments next to the calculations.";
        String bodmas2 ="I have tried to put the square root but it came as an error.";

        char a = '3';
        byte b = 2+4*30;                       // applying multiplication first 4*30=60 / 2+120=122
        short c = 10000+15-4;                 // 10000+15=515 = 10015-4= 10011
        int d = 55555*4+(10-3);              // 55555*40+(7) = 222220+7 = 222227
        long e = 123456+34-(10*10L);         // 123456+34-(100) = 123490-100= 123390
        float f = 100+101*10/(60-37.5f);     /* Bracket 60-37.5= 22.5
                                                Division 101*10=1010= 1010/22.5= 44.888
                                                Addition  100+44.888 = 144.888*/

        double z = 45.96+20*5+10+(2-1);        //45+100+10+1= 156.96
        {
        }
        System.out.println(bodmas+" "+bodmas1+" "+bodmas2);
        System.out.println("char: "+a);
        System.out.println("byte: "+b);
        System.out.println("short: "+c);
        System.out.println("int: "+d);
        System.out.println("long: "+e);
        System.out.println("float: "+f);
        System.out.println("double: "+z);
    }
}
