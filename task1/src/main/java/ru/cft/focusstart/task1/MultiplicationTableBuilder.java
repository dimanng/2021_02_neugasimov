package ru.cft.focusstart.task1;

public class MultiplicationTableBuilder {

    private MultiplicationTableBuilder() {
    }

    private static final char SYMBOL_SPACE = ' ';
    private static final char SYMBOL_OF_LINE_TRANSLATION = '\n';
    private static final char SYMBOL_OF_PIPE = '|';

    static StringBuilder buildTable(int size, int maxCellSize, int capacity) {
        int item;
        StringBuilder table = new StringBuilder(capacity);
        String separatorLine = RowBuilder.printString(maxCellSize, size);
        for (int i = 0; i <= size; i++) {
            int j = 0;
            item = i;
            RowBuilder.printSpaces(maxCellSize, size, item, j, table);
            if (item == 0) {
                table.append(SYMBOL_SPACE);
            } else {
                table.append(item);
            }
            for (j = 1; j <= size; j++) {
                if (i == 0) {
                    item = j;
                } else {
                    item = i * j;
                }
                table.append(SYMBOL_OF_PIPE);
                RowBuilder.printSpaces(maxCellSize, size, item, j, table);
                table.append(item);
            }
            table.append(SYMBOL_OF_LINE_TRANSLATION);
            table.append(separatorLine);
            table.append(SYMBOL_OF_LINE_TRANSLATION);
        }
        return table;
    }
}
