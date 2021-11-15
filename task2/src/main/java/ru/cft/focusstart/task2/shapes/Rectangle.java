package ru.cft.focusstart.task2.shapes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.cft.focusstart.task2.utils.MathMethods;
import ru.cft.focusstart.task2.Program;

public class Rectangle implements Shape{
    private static final Logger log = LoggerFactory.getLogger(Rectangle.class.getName());
    private double side1;
    private double side2;

    public Rectangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getDiagonal(){
        double diagonal = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
        diagonal = MathMethods.roundToTwoDigits(diagonal);
        return diagonal;
    }

    @Override
    public double getArea() {
        double area = MathMethods.roundToTwoDigits(side1 * side2);
        return area;
    }

    @Override
    public double getPerimeter() {
        double perimeter = MathMethods.roundToTwoDigits((side1 + side2) * 2);
        return perimeter;
    }

    @Override
    public String getInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        Rectangle rectangle = this;
        log.info("Calculating rectangle parameters");
        stringBuilder
                .append("Тип фигуры: прямоугольник").append("\n")
                .append("Площадь: ").append(rectangle.getArea()).append(" кв.мм").append("\n")
                .append("Периметр: ").append(rectangle.getPerimeter()).append(" мм").append("\n")
                .append("Сторона 1: ").append(rectangle.getSide1()).append(" кв.мм").append("\n")
                .append("Сторона 2: ").append(rectangle.getSide2()).append(" кв.мм").append("\n")
                .append("Диагональ: ").append(rectangle.getDiagonal()).append(" кв.мм").append("\n");
        return stringBuilder.toString();
    }
}
