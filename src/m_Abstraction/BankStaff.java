    package m_Abstraction;
      class BankStaff extends EmployeeSalary {
            void employeeName() {
                String name = "Rohan";
                System.out.println("Employee name: "+name);
            }
            void hourlyRate(){
                int i=30;
                System.out.println("Hourly rate: "+"£"+i+" per hour");
            }
            void workingHours(){
                float f=18.75f;
                System.out.println("Total working hours per week: "+f+" hours");
            }
            void getSickPay(){
                boolean b= false;
                System.out.println("gets paid sick leave: "+b);
        }
            public static void main(String[] args) {//Object created for subclass
                BankStaff bs=new BankStaff();
                bs.employeeName();
                bs.workingHours();
                bs.hourlyRate();
                bs.getSickPay();
            }}

