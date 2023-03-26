package g_ConditionIfElseSwitch180223;
public class IfElseClass2 {
    public static void checkMultipleOf5(int number){
        if (number%5==0)
        {System.out.println(number+" is a multiple of 5.");}
        else {
        System.out.println(number +" is NOT a multiple of 5.");}
    }

    public static void main(String[] args) {
        checkMultipleOf5(5);
        checkMultipleOf5(14);
        checkMultipleOf5(15);
        checkMultipleOf5(23);
        checkMultipleOf5(25);
    }
    }
