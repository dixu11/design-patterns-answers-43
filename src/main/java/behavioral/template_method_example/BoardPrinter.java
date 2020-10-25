package behavioral.template_method_example;

public abstract class BoardPrinter {

   final public void printBoard() {
        printStart();
        road();
        printEnd();
    }

    private void printStart() {
        System.out.println("Start");
    }

    protected abstract void road();

    private void printEnd() {
        System.out.println("End");
    }



}
