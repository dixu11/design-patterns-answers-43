package creational.factoryMethodExample;

public class TankLeft extends Tank {
    @Override
    public Barrel buildBarrel() {
        return new BarrelLeft();
    }
}
