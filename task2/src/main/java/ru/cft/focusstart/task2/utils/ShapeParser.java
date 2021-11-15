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

    public Shape parse(List<String> listArgs) {
        String shapesSwitch = listArgs.get(0);
        List<Double> params = parseDoubleParams(listArgs.get(1));
        switch (shapesSwitch){
            case ("CIRCLE"):
                log.info("Circle shape selected");
                return parseCircle(params);
            case ("TRIANGLE"):
                log.info("Triangle shape selected");
                return parseTriangle(params);
            case ("RECTANGLE"):
                log.info("Rectangle shape selected");
                return parseRectangle(params);
        }
        log.error("Unsupported type shape");
        throw new IllegalArgumentException("Неизвестный тип фигуры:" + shapesSwitch);
    }

    private Shape parseRectangle(List<Double> params) {
        log.info("Reading rectangle parameters");
        if(params.size() != 2){
            log.error("Incorrect count parameters for rectangle");
            throw new IllegalArgumentException("Неверное количество параметров для прямоугольника");
        }
        return new Rectangle(params.get(0), params.get(1));
    }

    private Shape parseTriangle(List<Double> params) {
        log.info("Reading Triangle parameters");
        if(params.size() != 3){
            log.error("Incorrect count parameters for triangle");
            throw new IllegalArgumentException("Неверное количество параметров для треугольника");
        }
        return new Triangle(params.get(0), params.get(1), params.get(2));
    }

    private Circle parseCircle(List<Double> params) {
        log.info("Reading Circle parameters");
        if(params.size() != 1){
            log.error("Incorrect count parameters for circle");
            throw new IllegalArgumentException("Неверное количество параметров для круга");
        }
        return new Circle(params.get(0));
    }

    private List<Double> parseDoubleParams(String s) {
        List<Double> listDouble = new ArrayList<>();
        for (String s1 : s.split(" ")) {
            listDouble.add(Double.valueOf(s1));
        }
        return listDouble;
    }
}
