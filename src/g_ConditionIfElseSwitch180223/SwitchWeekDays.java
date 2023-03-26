package g_ConditionIfElseSwitch180223;
public class SwitchWeekDays{
    public static void main(String[] args) { //Print if wfh/officeday/home
             int h= 7;// Print the day depending on the value of h
        switch(h){
            case 1:
            System.out.println("Monday- Working from Home");
            break;
            case 2:
                System.out.println("Tuesday- Office day");
                break;
            case 3:
                System.out.println("Wednesday- Working from Home");
                break;
            case 4:
                System.out.println("Thursday- Office day");
                break;
            case 5:
                System.out.println("Friday-Working from Home");
                break;
            case 6:
                System.out.println("Saturday- Relax");
                break;
            case 7:
                System.out.println("Sunday -Family time");
                break;
            default:
                System.out.println("Match not found");
        }}}
