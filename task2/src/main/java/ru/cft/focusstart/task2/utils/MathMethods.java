package ru.cft.focusstart.task2.utils;

public class MathMethods {

    public static double roundToTwoDigits(double value){
        double newValue = Math.round(value * 100.0) / 100.0;
        return newValue;
    }
}
