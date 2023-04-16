package q_Exception;

    public class IndexOutOfBoundsException {
        public static void main(String[] args) {
            String[] names = {"Rima", "Rita", "Ram", "Rohit", "Riya"};
            //index count       0      1        2      3        4
            System.out.println(names[2]); // this will print RAM
            System.out.println(names[6]); // this will give error as trying to print index 6 which doesn't exist
        }
    }

