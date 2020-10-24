package behavioral.strategy;
//TODO należy wykorzystać tę klasę - wyświetlanie wygaszacza
public class RenderScreenSaverStrategy implements RenderStrategy {

    @Override
    public void render() {
        System.out.println("Wyświetlam wygaszacz");
    }
}
