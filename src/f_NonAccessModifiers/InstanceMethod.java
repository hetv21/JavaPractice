package f_NonAccessModifiers;
public class InstanceMethod {
    public static void main(String[] args) {
        InstanceMethod myObj =new InstanceMethod();
        myObj.countMinutes();
    }
    public void countMinutes() {  // How many minutes in a day (24 hours)
        int a = 24; // 24 hours in a day
        int b = 60; // 60 minutes in 1 hour
        int c = a * b; // 24 * 60
        System.out.println(c);
    }
    }
