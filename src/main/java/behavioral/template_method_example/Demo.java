package behavioral.template_method_example;

public class Demo {

    public static void main(String[] args) {
        BoardPrinter forest = new MountainBoardPrinter();
        forest.printBoard();
    }


}
