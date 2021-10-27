package ru.cft.focusstart.task1;

import java.util.Scanner;

public class MultiplicationTablePrinter {
    public void run() {
        final int LOWER_BOUND = 1;
        final int UPPER_BOUND = 32;

        System.out.println("Введите размер таблицы от 1 до 32: ");
        Scanner scanner = new Scanner(System.in);
        int size;
        try {
            size = scanner.nextInt();
            if (size < LOWER_BOUND || size > UPPER_BOUND) {
                System.out.println("Введенное число не находится в диапазоне от 1 до 32");
            } else {
                int maxCellSize = DigitUtils.getCountsOfDigits(size * size);
                int capacity = ((maxCellSize + 1) * size + DigitUtils.getCountsOfDigits(size)) * (size + 1) * 2 + (size + 1) * 2; //емкость stringbuilder
                StringBuilder table = MultiplicationTableBuilder.buildTable(size, maxCellSize, capacity);
                System.out.print(table);
            }
        } catch (Exception e) {
            System.out.println("Ошибка! Должно быть введено число");
        }
    }
}


