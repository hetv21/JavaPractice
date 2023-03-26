    package m_Abstraction;
     class PermanentStaff extends EmployeeSalary {
        void employeeName() {
            String name = "Ritu";
            System.out.println("Employee name: "+name);
        }
        void hourlyRate(){
        int i=25;
            System.out.println("Hourly rate: "+"£"+i+" per hour");
        }
        void workingHours(){
        float f=37.5f;
            System.out.println("Total working hours per week:"+f+" hours");
        }
         void getSickPay(){
            boolean b= true;
            System.out.println("gets paid sick leave: "+b);
        }
        public static void main(String[] args) {//Object created for subclass
            PermanentStaff ps= new PermanentStaff();
            ps.employeeName();
            ps.workingHours();
            ps.hourlyRate();
            ps.getSickPay();
    }
}
