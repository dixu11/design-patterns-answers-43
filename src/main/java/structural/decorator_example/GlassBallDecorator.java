package structural.decorator_example;

public class GlassBallDecorator implements ChristmasTree{

    private ChristmasTree christmasTree;

    public GlassBallDecorator(ChristmasTree christmasTree) {
        this.christmasTree = christmasTree;
    }

    @Override
    public String display() {
        return christmasTree.display() + " z bombkami ";
    }

    public void breakBall() {
        System.out.println("Zbito bombkę!");
    }
}
