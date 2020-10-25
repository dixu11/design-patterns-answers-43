package structural.adapter_example;

public class FigureAdapter implements Figure {

    private IChecker checker;

    public FigureAdapter(IChecker checker) {
        this.checker = checker;
    }

    @Override
    public String getFieldsToMove() {
        return checker.getMoves();
    }
}
