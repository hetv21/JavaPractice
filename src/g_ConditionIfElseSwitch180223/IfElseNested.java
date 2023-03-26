package g_ConditionIfElseSwitch180223;
public class IfElseNested {
            public static void checkLeapYear(int year) {               //Static method created
                    if ((year % 4 == 0))
                        if (year % 100 == 0)
                            if (year % 400 == 0)
                                System.out.println("Year "+ year +": This is a Leap year.");
                            else
                                System.out.println("Year "+ year +": No, this is not a Leap year.");
                        else
                            System.out.println("Year "+ year +": This is a Leap Year.");
                    else
                        System.out.println("Year "+ year +": No, this is not a Leap Year.");
            }
    public static void main(String[] args) {
        checkLeapYear(1984);                       // calling method directly as its static
        checkLeapYear(1989);
        checkLeapYear(2000);
        checkLeapYear(2005);
        checkLeapYear(2008);
        checkLeapYear(2013);
        checkLeapYear(2018);
    }}
          //Explanation below:   Please let me know if I understood it correctly.
     /*
     Year 1984 -is divisible by 4 and doesn't leave a remainder(line 4) then
     it will go to line 5(1984%100==0 / 1984 is not divisible by 100) -
     If condition not satisfied,So it goes to else in line 10 and print-This is a Leap year

     Year 1989- is not divisible by 4, it will print line 12. No, it's not a leap year

     Year 2000: is divisible by 4 (Line 4) then it goes to line 5- divisible by 100
     then it goes to line 6 where it's divisible by 400, All if conditions are met So it will print line 7 */

