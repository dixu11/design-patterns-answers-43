package creational.factoryMethodExample;

public abstract class Tank {

    private Barrel barrel;

    public Tank(){
        barrel = buildBarrel();
    }

    protected abstract Barrel buildBarrel();


    public void attack() {
        barrel.shoot();
    }

}
