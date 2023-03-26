package l2_PolymorphismOverriding;

    public class Kid1 {//Method name is same; Data type is same;
        // We cannot change data type or number of variables
        //Kids room
        public void paintRoom(){ // Non-static/Instance method
            String color= "Pink";
            System.out.println("Kid 1 wants to paint pink color with a purple accent wall");
        }
        public static void bed(){
            System.out.println("Kid 1 suggested on getting bunk bed");
        }
        //static method

        public static void main(String[] args) {
            Kid1 room1=new Kid1(); //Object created to access method
            room1.paintRoom();
            bed();
        }
    }
