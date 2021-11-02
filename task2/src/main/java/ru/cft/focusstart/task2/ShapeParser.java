package ru.cft.focusstart.task2;

import java.util.ArrayList;
import java.util.List;

public class ShapeParser {

    public Shape parse(List<String> listArgs) {
        String shapesSwitch = listArgs.get(0);
        List<Double> params = parseDoubleParams(listArgs.get(1));
        switch (shapesSwitch){
            case ("CIRCLE"):
                return parseCircle(params);
            case ("TRIANGLE"):
                return parseTriangle(params);
            case ("RECTANGLE"):
                return parseRectangle(params);
        }
        throw new IllegalArgumentException("Неизвестный тип фигуры:" + shapesSwitch);
    }

    private Shape parseRectangle(List<Double> params) {
        return new Rectangle(params.get(0), params.get(1));
    }

    private Shape parseTriangle(List<Double> params) {
        return new Triangle(params.get(0), params.get(1), params.get(2));
    }

    private Circle parseCircle(List<Double> params) {
        return new Circle(params.get(0));
    }

    private List<Double> parseDoubleParams(String s) {
        List<Double> listDouble = new ArrayList<Double>();
        for (String s1 : s.split(" ")) {
            listDouble.add(Double.valueOf(s1));
        }
        return listDouble;
    }
}
