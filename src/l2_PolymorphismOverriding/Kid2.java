    package l2_PolymorphismOverriding;
    public class Kid2 extends Kid1 { //Kids room
            public void paintRoom(){// Non-static/Instance method
                String color= "blue";
                System.out.println("Kid 2 wants to paint blue color with a black accent wall");
        }
        public static void bed(){
            System.out.println("Kid 2 is happy with bunk bed");
        }// static method

            public static void main(String[] args) {
              Kid2 room2=new Kid2();// Object created
              room2.paintRoom(); //paint room method from room1 will be overridden, and it will print room 2
              bed(); // so will be the bed method-static method so called directly
            }}
