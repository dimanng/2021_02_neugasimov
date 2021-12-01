package ru.cft.focusstart.task2.shapes;

public interface Shape {
    String typeConstant = "Тип фигуры: ";
    String squareConstant = "Площадь: ";
    String perimeterConstant = "Периметр: ";
    double getArea();
    double getPerimeter();
    String getInfo();
}
