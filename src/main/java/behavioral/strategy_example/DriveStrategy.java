package behavioral.strategy_example;

public class DriveStrategy implements RunStrategy {
    @Override
    public void run() {
        System.out.println("Jade!");
    }
}
