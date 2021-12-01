package ru.cft.focusstart.task2.shapes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.cft.focusstart.task2.utils.MathMethods;

public class Circle implements Shape {
    private static final Logger log = LoggerFactory.getLogger(Circle.class.getName());
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getDiameter() {
        return radius * 2;
    }

    @Override
    public double getArea() {
        double area = MathMethods.roundToTwoDigits(Math.PI * Math.pow(radius, 2));
        return area;
    }

    @Override
    public double getPerimeter() {
        double perimeter = MathMethods.roundToTwoDigits(2 * Math.PI * radius);
        return perimeter;
    }

    @Override
    public String getInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        Circle circle = this;
        log.info("Calculating circle parameters");
        stringBuilder
                .append(typeConstant).append("круг").append("\n")
                .append(squareConstant).append(circle.getArea()).append(" кв.мм").append("\n")
                .append(perimeterConstant).append(circle.getPerimeter()).append(" мм").append("\n")
                .append("Радиус: ").append(circle.getRadius()).append(" мм").append("\n")
                .append("Диаметр: ").append(circle.getDiameter()).append(" мм").append("\n");
        return stringBuilder.toString();
    }
}
