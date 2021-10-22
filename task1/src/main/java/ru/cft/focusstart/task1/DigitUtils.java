package ru.cft.focusstart.task1;

public class DigitUtils {
    public static int getCountsOfDigits(int number) {   //Метод вычисления количества цифр в числе
        int count = 0;
        if (number == 0) {
            return count = 1;
        }
        while (number != 0) {
            number /= 10;
            count++;
        }
        return count;
    }
}
