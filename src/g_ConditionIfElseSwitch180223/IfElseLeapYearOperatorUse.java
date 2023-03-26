package g_ConditionIfElseSwitch180223;

public class IfElseLeapYearOperatorUse {
    public static void leapYear(int year) {     //Static method
          /* If year is divisible by 4 && if year is not equals to zero (Not divisible by 100
              or if year is divisible by 400*/

        if ((year%4==0 && year%100!=0) || (year%400==0))
            System.out.println("Year "+year+ ": This is a Leap Year.");
        else
            System.out.println("Year "+year+ ": This is a non-Leap year."); }

    public static void main(String[] args) {   //calling method directly as its Static
        leapYear(2000);
        leapYear(1992);
        leapYear(1984);
        leapYear(2010);
        leapYear(2005);
        leapYear(2024);
    }}


