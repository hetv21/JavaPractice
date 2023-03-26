package h_LoopControl250223;
        public class SumOfNumbersWhileLoop {
            public static void main(String[] args) {
            int number = 1;      //  current number
            int sum = 0;        //   running total
             while(number <=50) // this loop will run until it reaches 50
            { sum = sum + number; //add current number to running total
                number++;}              //increment
                System.out.println("Sum of numbers 1 to 50 is "+ sum);
        }}

/*  current number is 1 which is less than 50 so
    sum= 1 (sum (0)+ number(1)= 1) number increment 1+1= 2; 2<50
now sum =3 (sum=1 & number=2) = 1+2 =3 number increment 2+1= 3; 3<50
    sum =6 (sum=3 & number=3) =3+3 =6 then number increment so 4; 4<50
    sum= 6+4 = 10     number increment = 5; 5<50
    sum = 10+5 = 15   number increment = 6; 6<50
    sum = 15+6 = 21;  number increment = 7; 7<50
    sum = 21+7 = 28 & carry on....               */