package behavioral.strategy_example;

public class FlyStrategy implements RunStrategy{
    @Override
    public void run() {
        System.out.println("Leci!");
    }
}
