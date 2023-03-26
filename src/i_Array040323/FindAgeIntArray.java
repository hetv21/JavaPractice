package i_Array040323;
    public class FindAgeIntArray {
                        public static void main(String[] args) {
                       int age[]={21,25,16,98,10,5,71,4,3,1};
                            int oldest = age[0];
                            int youngest = age[0];
                            int i;
                            for (i=0; i<age.length; i++){
                                if (age[i]>oldest){
                                  oldest = age[i];
                                }
                           if (age[i]<youngest){
                             youngest = age[i];
                             }}
                        System.out.println("Oldest person's age in our group is "+"'"+ oldest+"'");
                        System.out.println("Youngest person's age in our group is "+"'"+youngest+"'");
                        }}


