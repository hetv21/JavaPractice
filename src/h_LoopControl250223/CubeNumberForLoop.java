package h_LoopControl250223;

    public class CubeNumberForLoop {
        public static void findCubeNumber() {//Static method
            for(int a=1; a<=10; a++) {
                int b= a * a * a;
                System.out.println("Cube Number of "+ a+" is "+b);
            }
        }
        public static void main(String[] args) {
            findCubeNumber();// calling method
        }
    }
