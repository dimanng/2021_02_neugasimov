package ru.cft.focusstart.task1;

public class DigitUtils {

    private DigitUtils() {
    }

    public static int getCountsOfDigits(int number) {   //Метод вычисления количества цифр в числе
          return String.valueOf(number).length();
    }
}
