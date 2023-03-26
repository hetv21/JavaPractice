package l2_PolymorphismOverriding;

public class Parents {
    public void paintRoom(){// Non-static/Instance method
        String color="Magenta";
        System.out.println("Parents decided to paint magenta color with a royal blue accent wall");
    }
    public static void bed(){
        System.out.println("Parent agreed with bunk bed suggestion");
    }// static method

    public static void main(String[] args) {
        Parents parents=new Parents();//Object created
        parents.paintRoom();
        bed();
    }}

