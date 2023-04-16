package p1_CollectionArrayList;

import java.util.ArrayList;

    public class LargestAndSmallestNumber {
        public static void main(String[] args) {

            ArrayList<Integer> myNumber = new ArrayList<>();
            myNumber.add(808);
            myNumber.add(99);
            myNumber.add(926);
            myNumber.add(174);
            myNumber.add(7);
            System.out.println(myNumber); // Printing ArrayList
            System.out.println("Length of the ArrayList is "+ myNumber.size());// finding length

            int largest = myNumber.get(0);
            int smallest = myNumber.get(0);
            int i;
            for (i=0; i< myNumber.size(); i++){
                if (myNumber.get(i)>largest){
                    largest = myNumber.get(i);
                }
                if (myNumber.get(i)<smallest){
                  smallest = myNumber.get(i);
                }
            }
            System.out.println("Largest number is: " +largest);
            System.out.println("Smallest number is: "+ smallest);
        }
    }



