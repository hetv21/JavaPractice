package q_Exception;

    public class ArithmaticExceptionVotingAge {
         static void giveVote(int age) throws ArithmeticException {
            if (age >= 18) {
                System.out.println("You are eligible for Voting");
            } else {
                throw new ArithmeticException("You are not eligible for Voting");
            }
        }
            public static void main (String[]args){
                giveVote(18);
                giveVote(25);
                giveVote(10);
            }
        }