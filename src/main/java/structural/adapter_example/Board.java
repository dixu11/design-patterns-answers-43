package structural.adapter_example;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private List<Figure> figures = new ArrayList<>();


    public void add(Figure figure) {
        figures.add(figure);
    }

    public void moveAllFigures() {
        for (Figure figure : figures) {
            System.out.println(figure.getFieldsToMove());
        }
    }

}
