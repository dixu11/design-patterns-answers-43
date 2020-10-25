package structural.decorator_example;

public class ChainDecorator implements ChristmasTree {

    private ChristmasTree decoratedObject;

    public ChainDecorator(ChristmasTree decoratedObject) {
        this.decoratedObject = decoratedObject;
    }

    @Override
    public String display() {
        return decoratedObject.display() + " z kolorowym łańcuchem";
    }
}
