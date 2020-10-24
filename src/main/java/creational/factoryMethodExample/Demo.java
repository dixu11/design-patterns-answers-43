package creational.factoryMethodExample;

public class Demo {
    public static void main(String[] args) {
        Tank leftTank = new TankLeft();
        Tank rightTank = new TankRight();

        leftTank.attack();
        rightTank.attack();
    }
}
