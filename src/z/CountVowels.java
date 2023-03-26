package z;

public class CountVowels {
            public static void main(String[] args) {
                String sentence = "wHaT a BeaUtIfuL sUnnY Day";
                sentence.toUpperCase();
                System.out.println(sentence.toUpperCase());
                sentence.toLowerCase();
                System.out.println(sentence.toLowerCase());

                char ch= sentence.charAt(0);
                int count=0;
                for(int i=0; i<sentence.length(); i++){
                    if(sentence.charAt(i)=='a'||sentence.charAt(i)=='e'||sentence.charAt(i)=='i'||
                       sentence.charAt(i)=='o'||sentence.charAt(i)=='u'){
                        count++;
                    }
                }
                System.out.println("Number of vowels in the sentence is: "+count);
                System.out.println("Number counted from original string sentence which are in lower case(line 3)");
            }
            }

