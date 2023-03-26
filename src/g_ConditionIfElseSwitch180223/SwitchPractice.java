package g_ConditionIfElseSwitch180223;
public class SwitchPractice {
    public void daysInMonthPoem(int days) {//Instance method created
            switch(days)    {
        case 1:
            System.out.println("30 days has September,");
            break;
        case 2:
            System.out.println("April, June & November.");
            break;
        case 3:
            System.out.println("February has 28.");
            break;
        case 4:
            System.out.println("Rest of the Months have 31.");
            break;
        default:
            System.out.println("Method creation worked :)"); }
}
    public static void main(String[] args) {//Object created
         SwitchPractice switchPractice = new SwitchPractice();
         switchPractice.daysInMonthPoem(1);
         switchPractice.daysInMonthPoem(2);
         switchPractice.daysInMonthPoem(3);
         switchPractice.daysInMonthPoem(4);
         switchPractice.daysInMonthPoem(6);
}}
