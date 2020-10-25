package structural.adapter_example;

public class Checker implements IChecker {
    @Override
    public String getMoves() {
        return "o jeden po skosie do przodu";
    }
}
