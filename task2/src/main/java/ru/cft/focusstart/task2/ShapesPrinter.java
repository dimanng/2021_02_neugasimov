package ru.cft.focusstart.task2;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class ShapesPrinter {

    public void Run() throws FileNotFoundException {
        FileReader fileReader = new FileReader("input.txt");
        ArrayList listArgs = fileReader.getFiguresArgs();

        String shapesSwitch = listArgs.get(0).toString();

        switch (shapesSwitch){
            case ("CIRCLE"):
                String radius = listArgs.get(1).toString();
                Circle circle = new Circle(Double.valueOf(radius));
                System.out.println("Тип фигуры: круг");
                System.out.println("Площадь: " + circle.getArea() + " кв.мм");
                System.out.println("Периметр: " + circle.getPerimeter() + " мм");
                System.out.println("Радиус: " + circle.getRadius() + " мм");
                System.out.println("Диаметр: " + circle.getDiameter() + " мм");
                break;
            case ("TRIANGLE"):
                String triangleside1 = listArgs.get(1).toString();
                String triangleside2 = listArgs.get(2).toString();
                String triangleside3 = listArgs.get(3).toString();
                Triangle triangle = new Triangle(Double.valueOf(triangleside1), Double.valueOf(triangleside2), Double.valueOf(triangleside3));
                System.out.println("Тип фигуры: треугольник");
                System.out.println("Площадь: " + triangle.getArea() + " кв.мм");
                System.out.println("Периметр: " + triangle.getPerimeter() + " мм");
                System.out.println("Сторона 1: " + triangle.getSide1() + " мм");
                System.out.println("Сторона 2: " + triangle.getSide2() + " мм");
                System.out.println("Сторона 3: " + triangle.getSide3() + " мм");
                System.out.println("Угол, противолежащий стороне 1: " + triangle.getAngle1() + " гр.");
                System.out.println("Угол, противолежащий стороне 2: " + triangle.getAngle2() + " гр.");
                System.out.println("Угол, противолежащий стороне 3: " + triangle.getAngle3() + " гр.");
                break;
            case ("RECTANGLE"):
                String side1 = listArgs.get(1).toString();
                String side2 = listArgs.get(2).toString();
                Rectangle rectangle = new Rectangle(Double.valueOf(side1), Double.valueOf(side2));
                System.out.println("Тип фигуры: прямоугольник");
                System.out.println("Площадь: " + rectangle.getArea() + " кв.мм");
                System.out.println("Периметр: " + rectangle.getPerimeter() + " мм");
                System.out.println("Сторона 1: " + rectangle.getSide1() + " кв.мм");
                System.out.println("Сторона 2: " + rectangle.getSide2() + " кв.мм");
                System.out.println("Диагональ: " + rectangle.getDiagonal() + " кв.мм");
                break;
            default:
                System.out.println("Неизвестный тип фигуры");
                break;
        }
    }
}
