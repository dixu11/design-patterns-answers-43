package behavioral.strategy_example;

public class DiveStrategy implements RunStrategy {
    @Override
    public void run() {
        System.out.println("Nurkuje");
    }
}
