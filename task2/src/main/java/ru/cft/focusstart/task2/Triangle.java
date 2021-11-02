package ru.cft.focusstart.task2;

public class Triangle implements Shape {

    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public double getAngle1() {
        double cos1 = (Math.pow(side2, 2) + Math.pow(side3, 2) - Math.pow(side1, 2)) / (2 * side2 * side3);
        double angle1 = Math.toDegrees(Math.acos(cos1));
        angle1 = MathMethods.roundToTwoDigits(angle1);
        return angle1;
    }
    public double getAngle2() {
        double cos2 = (Math.pow(side1, 2) + Math.pow(side3, 2) - Math.pow(side2, 2)) / (2 * side1 * side3);
        double angle2 = Math.toDegrees(Math.acos(cos2));
        angle2 = MathMethods.roundToTwoDigits(angle2);
        return angle2;
    }
    public double getAngle3() {
        double cos3 = (Math.pow(side1, 2) + Math.pow(side2, 2) - Math.pow(side3, 2)) / (2 * side1 * side2);
        double angle3 = Math.toDegrees(Math.acos(cos3));
        angle3 = MathMethods.roundToTwoDigits(angle3);
        return angle3;
    }

    @Override
    public double getArea() {
        double semiPerimeter = getPerimeter() / 2;
        double area = Math.sqrt(semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3));
        area = MathMethods.roundToTwoDigits(area);
        return area;
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }
}
