package ru.cft.focusstart.task2.utils;

public enum ShapeType {
    CIRCLE (1, "Круг"),
    TRIANGLE(3, "Треугольник"),
    RECTANGLE(2, "Прямоугольник");

    public String getRusName() {
        return rusName;
    }

    public int getParamsCount() {
        return paramsCount;
    }

    private int paramsCount;
    private String rusName;

    ShapeType(int paramsCount, String RusName) {
        this.paramsCount = paramsCount;
        rusName = RusName;
    }
}
