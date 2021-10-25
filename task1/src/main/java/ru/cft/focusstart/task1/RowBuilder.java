package ru.cft.focusstart.task1;

public class RowBuilder {

    private RowBuilder() {
    }

    static final char symbolMinus = '-';
    static final char symbolPlus = '+';
    static final char symbolSpace = ' ';

    static void printString(int maxCellSize, int index, int size, StringBuilder table) {    //Метод печати разделителя строк
        if (index == 0) {
            for (int k = 1; k <= DigitUtils.getCountsOfDigits(size); k++) {
                table.append(symbolMinus);
            }
        } else {
            for (int k = 1; k <= maxCellSize; k++) {
                table.append(symbolMinus);
            }
        }
        if (index < size) {
            table.append(symbolPlus);
        }
    }

    static void printSpaces(int maxCellSize, int size, int item, int index, StringBuilder table) {  //Метод печати пробелом перед числом в ячейке

        int countsOfSpaces;

        if (index == 0) {
            countsOfSpaces = DigitUtils.getCountsOfDigits(size) - DigitUtils.getCountsOfDigits(item);
            for (int i = 0; i < countsOfSpaces; i++) {
                table.append(symbolSpace);
            }
        } else {
            countsOfSpaces = maxCellSize - DigitUtils.getCountsOfDigits(item);
            for (int i = 0; i < countsOfSpaces; i++) {
                table.append(symbolSpace);
            }
        }
    }

}
