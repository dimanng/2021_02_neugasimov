package ru.cft.focusstart.task2;

public class ShapeFormater {
    public String format(Shape shape){
        StringBuilder stringBuilder = new StringBuilder();
        if(shape instanceof Circle){
            Circle circle = (Circle) shape;
            stringBuilder
            .append("Тип фигуры: круг").append("\n")
            .append("Площадь: ").append(circle.getArea()).append(" кв.мм").append("\n")
            .append("Периметр: ").append(circle.getPerimeter()).append(" мм").append("\n")
            .append("Радиус: ").append(circle.getRadius()).append(" мм").append("\n")
            .append("Диаметр: ").append(circle.getDiameter()).append(" мм").append("\n");
        } else if (shape instanceof Triangle){
            Triangle triangle = (Triangle) shape;
            stringBuilder
            .append("Тип фигуры: треугольник").append("\n")
            .append("Площадь: ").append(triangle.getArea()).append(" кв.мм").append("\n")
            .append("Периметр: ").append(triangle.getPerimeter()).append(" мм").append("\n")
            .append("Сторона 1: ").append(triangle.getSide1()).append(" мм").append("\n")
            .append("Сторона 2: ").append(triangle.getSide2()).append(" мм").append("\n")
            .append("Сторона 3: ").append(triangle.getSide3()).append(" мм").append("\n")
            .append("Угол, противолежащий стороне 1: ").append(triangle.getAngle1()).append(" гр.").append("\n")
            .append("Угол, противолежащий стороне 2: ").append(triangle.getAngle2()).append(" гр.").append("\n")
            .append("Угол, противолежащий стороне 3: ").append(triangle.getAngle3()).append(" гр.").append("\n");
        } else if (shape instanceof Rectangle){
            Rectangle rectangle = (Rectangle) shape;
            stringBuilder
            .append("Тип фигуры: прямоугольник").append("\n")
            .append("Площадь: ").append(rectangle.getArea()).append(" кв.мм").append("\n")
            .append("Периметр: ").append(rectangle.getPerimeter()).append(" мм").append("\n")
            .append("Сторона 1: ").append(rectangle.getSide1()).append(" кв.мм").append("\n")
            .append("Сторона 2: ").append(rectangle.getSide2()).append(" кв.мм").append("\n")
            .append("Диагональ: ").append(rectangle.getDiagonal()).append(" кв.мм").append("\n");
        } else {
            throw new IllegalArgumentException("Неизвестный тип фигуры");
        }

        return stringBuilder.toString();
    }
}
