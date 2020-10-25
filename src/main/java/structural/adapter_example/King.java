package structural.adapter_example;

public class King  implements  Figure{
    @Override
    public String getFieldsToMove() {
        return "jedno pole obok siebie";
    }
}
