package ru.cft.focusstart.task2;

public class Circle implements Shape {

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
}
