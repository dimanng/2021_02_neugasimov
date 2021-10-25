package ru.cft.focusstart.task1;

public class MultiplicationTableBuilder {

    private MultiplicationTableBuilder() {
    }

    static final char symbolSpace = ' ';
    static final char symbolOfLineTranslation = '\n';
    static final char symbolOfPipe = '|';

    static StringBuilder buildTable(int size, int maxCellSize, int capacity) {
        int item;
        StringBuilder table = new StringBuilder(capacity);
        for (int i = 0; i <= size; i++) {
            int j = 0;
            item = i;
            RowBuilder.printSpaces(maxCellSize, size, item, j, table);
            if (item == 0) {
                table.append(symbolSpace);
            } else {
                table.append(item);
            }
            for (j = 1; j <= size; j++) {
                if (i == 0) {
                    item = j;
                } else {
                    item = i * j;
                }
                table.append(symbolOfPipe);
                RowBuilder.printSpaces(maxCellSize, size, item, j, table);
                table.append(item);
            }
            table.append(symbolOfLineTranslation);
            for (int k = 0; k <= size; k++) {
                RowBuilder.printString(maxCellSize, k, size, table);
            }
            table.append(symbolOfLineTranslation);
        }
        return table;
    }
}
