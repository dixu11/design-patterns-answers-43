package behavioral.template_method_example;

public class MountainBoardPrinter extends BoardPrinter {
    @Override
    protected void road() {
        System.out.println("Trasa biegnie przez góry");
    }
}
