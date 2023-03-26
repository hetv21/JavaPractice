package h_LoopControl250223;
        public class FibonacciSeriesForLoop {
            /*Print Fibonacci series-next number is obtained by doing
              a sum of previous 2 numbers- 0,1,1,2,3,5,8,13,
              0,1,0+1=1, 1+1=2, 1+2=3,2+3=5,3+5=8,5+8=13...*/

                public static void main(String[] args) {
                int a1= 0; // created variable & assigned value
                int a2= 1;
                   System.out.println(a1);  // printed 0 as it starts with 0
                   System.out.println(a2);  // printed 1
                int a3;                     // a3=a1+a2

              for (int i=0; i<15; i++) { //(Initialization; condition; increment/decrement)
              a3 = a1 + a2;       // 1(a3)= (0)a2+(1)a1
                  System.out.println(a3);
              a1 = a2;
              a2 = a3;

          }
          System.out.println("& it goes on... if we change the condition.");
        }}

