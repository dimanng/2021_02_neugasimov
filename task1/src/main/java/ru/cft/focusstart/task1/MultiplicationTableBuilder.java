package ru.cft.focusstart.task1;

    class MultiplicationTableBuilder {
    static StringBuilder buildTable(int size, int maxCellSize, int capacity) {
        int item;
        StringBuilder table = new StringBuilder(capacity);

        for (int i = 0; i <= size; i++) {

            for (int j = 0; j <= size; j++) {

                if (j == 0) {

                    item = i;

                    RowBuilder.printSpaces(maxCellSize, size, item, j, table);

                    if (item == 0) {
                        table.append(" ");
                    } else {
                        table.append(item);
                    }

                } else {

                    if (i == 0) {
                        item = j;
                    } else {
                        item = i * j;
                    }

                    table.append("|");
                    RowBuilder.printSpaces(maxCellSize, size, item, j, table);
                    table.append(item);
                }

            }

            table.append("\n");

            for (int k = 0; k <= size; k++) {

                RowBuilder.printString(maxCellSize, k, size, table);
            }

            table.append("\n");

        }
        return table;
    }


}
