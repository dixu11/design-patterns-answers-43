package structural.decorator_example;

public class Demo {
    public static void main(String[] args) {
        ChristmasTreeBase tree = new ChristmasTreeBase();
        System.out.println(tree.display());

        ChristmasTree dekorowaneDrzewo = new ChainDecorator(new ChristmasTreeBase());
        System.out.println(dekorowaneDrzewo.display());

        GlassBallDecorator drzewoNaWypasie = new GlassBallDecorator(new ChainDecorator(new ChristmasTreeBase()));
        System.out.println(drzewoNaWypasie.display());
        drzewoNaWypasie.breakBall();
        System.out.println(drzewoNaWypasie.display());
        drzewoNaWypasie.breakBall();

       /* ChainDecorator chain = new ChainDecorator(new ChristmasTreeBase());
        chain.metodaZChain();
        GlassBallDecorator glass = new GlassBallDecorator(chain);
        glass.breakBall();*/


    }
}
