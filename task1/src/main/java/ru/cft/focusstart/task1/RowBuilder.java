package ru.cft.focusstart.task1;

public class RowBuilder {

    private RowBuilder() {
    }

    private static final char SYMBOL_MINUS = '-';
    private static final char SYMBOL_PLUS = '+';
    private static final char SYMBOL_SPACE = ' ';

    public static String printString(int maxCellSize, int size) {    //Метод печати разделителя строк
        int capacity = (maxCellSize + 1) * size + DigitUtils.getCountsOfDigits(size);
        StringBuilder separatorBuilder = new StringBuilder(capacity);
        for (int k = 1; k <= DigitUtils.getCountsOfDigits(size); k++) {
            separatorBuilder.append(SYMBOL_MINUS);
        }
        separatorBuilder.append(SYMBOL_PLUS);
        for (int i = 1; i <= size; i++) {
            for (int k = 1; k <= maxCellSize; k++) {
                separatorBuilder.append(SYMBOL_MINUS);
            }
            if (i < size) {
                separatorBuilder.append(SYMBOL_PLUS);
            }
        }
        return separatorBuilder.toString();
    }

    static void printSpaces(int maxCellSize, int size, int item, int index, StringBuilder table) {  //Метод печати пробелом перед числом в ячейке

        int countsOfSpaces;

        if (index == 0) {
            countsOfSpaces = DigitUtils.getCountsOfDigits(size) - DigitUtils.getCountsOfDigits(item);
            for (int i = 0; i < countsOfSpaces; i++) {
                table.append(SYMBOL_SPACE);
            }
        } else {
            countsOfSpaces = maxCellSize - DigitUtils.getCountsOfDigits(item);
            for (int i = 0; i < countsOfSpaces; i++) {
                table.append(SYMBOL_SPACE);
            }
        }
    }

}
