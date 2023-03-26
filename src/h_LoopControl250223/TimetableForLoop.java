package h_LoopControl250223;

public class TimetableForLoop {
            public void timeTable(int number){// Instance method created
                System.out.println("***=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=***");
                System.out.println("Please see the Timetable of "+ "'"+number+"'"+ " as below:");
                for(int a=20; a>=1; a--){    // reverse printing using decrement
                    int b = number * a;
                    System.out.println(number+"*"+a+"="+b);
                }
                System.out.println();
            }
            public static void main(String[] args) {
                TimetableForLoop timetable= new TimetableForLoop(); //Object creation
                timetable.timeTable(20);
                timetable.timeTable(19);
                timetable.timeTable(18);
                timetable.timeTable(17);
                timetable.timeTable(16);
                timetable.timeTable(15);
            }}
