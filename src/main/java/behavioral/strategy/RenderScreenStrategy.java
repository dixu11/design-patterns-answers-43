package behavioral.strategy;

//TODO należy wykorzystać tę klasę - wyświetlanie normalnego ekranu
public class RenderScreenStrategy implements RenderStrategy {

    @Override
    public void render() {
        System.out.println("Wyświetlam normalny ekran");
    }
}
