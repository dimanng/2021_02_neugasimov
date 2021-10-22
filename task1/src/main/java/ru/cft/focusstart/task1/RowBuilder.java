package ru.cft.focusstart.task1;

public class RowBuilder {
    static void printString(int maxCellSize, int index, int size, StringBuilder table) {    //Метод печати разделителя строк

        if (index == 0) {
            for (int k = 1; k <= DigitUtils.getCountsOfDigits(size); k++) {
                table.append("-");
            }
        } else {
            for (int k = 1; k <= maxCellSize; k++) {
                table.append("-");
            }
        }
        if (index < size) {
            table.append("+");
        }
    }

    static void printSpaces(int maxCellSize, int size, int item, int index, StringBuilder table) {  //Метод печати пробелом перед числом в ячейке

        int countsOfSpaces;

        if (index == 0) {
            countsOfSpaces = DigitUtils.getCountsOfDigits(size) - DigitUtils.getCountsOfDigits(item);
            ;
            for (int i = 0; i < countsOfSpaces; i++) {
                table.append(" ");
            }
        } else {
            countsOfSpaces = maxCellSize - DigitUtils.getCountsOfDigits(item);
            for (int i = 0; i < countsOfSpaces; i++) {
                table.append(" ");
            }
        }
    }

}
