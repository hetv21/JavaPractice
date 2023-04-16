package q_Exception;

    public class TryCatchFinally {
        public static void main(String[] args) {
            try {
                String[] names = {"Rima", "Rita", "Ram", "Rohit", "Riya"};
                //index count       0      1        2      3        4
                System.out.println(names[6]);
                System.out.println(names[1]);
            } catch (Exception e) {
                System.out.println("Some error occurred"); //this will be printed
            } finally {  //It will be executed irrespective of exception occurs or ont
                System.out.println("Exception handling");
            }
        }
    }