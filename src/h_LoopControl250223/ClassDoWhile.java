package h_LoopControl250223;
            public class ClassDoWhile { //Which TV do i own?
                public static void main(String[] args) {/*Combine use of if, break & Operators
                                                         in do while */
                    String myTele = "Samsung";
                    do {
                        System.out.println("Which company TV do i have?");
                        if (myTele == "Sony")
                        System.out.println("No, I don't have SonyTV.");
                        if (myTele == "Toshiba")
                        System.out.println("Not Toshiba either,");
                        break;}

                    while (myTele != ("Sony"+"Toshiba") && myTele=="Samsung");
                    System.out.println("Bingo:) It is "+ myTele+".");
                }}
