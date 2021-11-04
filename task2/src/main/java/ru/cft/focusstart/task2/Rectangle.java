package ru.cft.focusstart.task2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Rectangle implements Shape{
    private static final Logger log = LoggerFactory.getLogger(Program.class.getName());
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
}
