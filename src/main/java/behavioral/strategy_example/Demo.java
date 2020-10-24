package behavioral.strategy_example;

public class Demo {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run();
        vehicle.setRunStrategy(new FlyStrategy());
        vehicle.run();
        vehicle.setRunStrategy(new DiveStrategy());
        vehicle.run();
    }
}
