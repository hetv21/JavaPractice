package i_Array040323;
    public class CharArray {
        public static void main(String[] args) {
            char[] alphabets={'c','h','a','r','A','R','R','A','Y'};
            for (char Alphabet:alphabets) {
                System.out.println(Alphabet);  }

            System.out.println("*******************");
            char[] array={'1','2','3','4','5','6','7','1'};
               //index     0   1   2   3   4   5   6   7
              // length    1   2   3   4   5   6   7   8
            System.out.println("length of Array="+array.length);//find length
            System.out.println(array[2]);
            array[0]= '3';//value for 0 will print as 3 and not 1- as we assign a new value'3'
            System.out.println(array[0]);
            }
        }

