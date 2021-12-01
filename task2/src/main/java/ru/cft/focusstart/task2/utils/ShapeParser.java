package ru.cft.focusstart.task2.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.cft.focusstart.task2.shapes.Circle;
import ru.cft.focusstart.task2.shapes.Rectangle;
import ru.cft.focusstart.task2.shapes.Shape;
import ru.cft.focusstart.task2.shapes.Triangle;

import java.util.ArrayList;
import java.util.List;

public class ShapeParser {

    private static final Logger log = LoggerFactory.getLogger(ShapeParser.class.getName());

    private List<String> listArgs;

    public ShapeParser(List<String> listArgs) {
        this.listArgs = listArgs;
    }

    public ShapeParser() {
    }

    public Shape parse() {
        ShapeType shapeType = ShapeType.valueOf(listArgs.get(0));
        List<Double> params = parseDoubleParams(listArgs.get(1));
        checkCountParameters(params, shapeType);
        switch (shapeType){
            case CIRCLE:
                log.info("Circle shape selected");
                return new Circle(params.get(0));
            case TRIANGLE:
                log.info("Triangle shape selected");
                return new Triangle(params.get(0), params.get(1), params.get(2));
            case RECTANGLE:
                log.info("Rectangle shape selected");
                return new Rectangle(params.get(0), params.get(1));
            default: throw new IllegalArgumentException("Неизвестный тип фигуры");
        }
    }

    private List<Double> parseDoubleParams(String s) {
        List<Double> listDouble = new ArrayList<>();
        for (String s1 : s.split(" ")) {
            listDouble.add(Double.valueOf(s1));
        }
        return listDouble;
    }

    private void checkCountParameters(List<Double> params, ShapeType shapeType){
        if(params.size() != shapeType.getParamsCount()){
            throw new IllegalArgumentException("Неверное количество аргументов для фигуры " + shapeType.getRusName());
        }
    }
}
