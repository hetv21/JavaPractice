package n_Interface;

public interface Drivable {// only contains abstract methods
    //showing functionality but hiding implementation
    //method will be public by default
    String speedUp();
    String slowDown();
    default void turnAOn() {
        System.out.println("Turning the vehicle on.");
    }
    default String carryPassenger() {
        return "How many people can travel";
    }
}
