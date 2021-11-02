package ru.cft.focusstart.task2;

public class MathMethods {

    public static double roundToTwoDigits(double value){
        double NewValue = Math.round(value * 100.0) / 100.0;
        return NewValue;
    }


}
