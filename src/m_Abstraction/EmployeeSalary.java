        package m_Abstraction;
            abstract class EmployeeSalary {//Abstract means idea without concrete existence
                // This is Abstract class- It can have abstract and non-abstract method
                //keyword used -Abstract// private,protected, final modifiers can be used
                void employeeName() { //Non-Abstract method
                    System.out.println("Name of the employee");
                }
                abstract void hourlyRate();//Abstract method is declared without an implementation
                                           // without braces followed by semicolon
                abstract void workingHours();//Abstract method
                abstract void getSickPay();//Abstract method

                public static void main(String[] args) {
                    System.out.println("Bank Staff:-");
                 EmployeeSalary bs= new BankStaff();
                // Abstract class name Object name= new Subclass name
                //Object created for Abstract class using subclass
                //We cannot create object for Abstract class but can be done using subclass
                 bs.employeeName();
                 bs.hourlyRate();
                 bs.workingHours();
                 bs.getSickPay();
                   System.out.println(" ");
                   System.out.println("Permanent Staff:-");
                 EmployeeSalary ps= new PermanentStaff();
                // Abstract class name Object name= new Subclass name
                 ps.employeeName();
                 ps.hourlyRate();
                 ps.workingHours();
                 ps.getSickPay();
                }}

