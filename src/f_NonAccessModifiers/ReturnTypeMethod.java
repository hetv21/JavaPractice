package f_NonAccessModifiers;
public class ReturnTypeMethod {
    public int sum(int a, int b){
        int c = a+b;
        return c;
    }

    public static void main(String[] args) {
       ReturnTypeMethod mySumObj = new ReturnTypeMethod();
        System.out.println(mySumObj.sum(20, 30));
        System.out.println(mySumObj.sum(30, 40));
    }
}
