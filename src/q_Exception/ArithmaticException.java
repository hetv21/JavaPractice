package q_Exception;

public class ArithmaticException {
    public static void division() {
        int a = 90;
        int b = 0;
        int c = a / b;
    }
    public static void main(String[] args) {
                division(); //will throw an exception as cant be divide by zero
    }
}