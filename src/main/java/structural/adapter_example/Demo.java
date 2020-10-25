package structural.adapter_example;

public class Demo {
    public static void main(String[] args) {
        Board board = new Board();
        board.add(new King());
        board.add(new FigureAdapter(new Checker()));
        board.moveAllFigures();
    }
}
