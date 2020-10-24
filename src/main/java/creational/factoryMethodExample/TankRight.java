package creational.factoryMethodExample;

public class TankRight extends  Tank {
    @Override
    public Barrel buildBarrel() {
        return new BarrelRight();
    }
}
