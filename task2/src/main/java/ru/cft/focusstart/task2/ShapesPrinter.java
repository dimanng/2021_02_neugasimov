package ru.cft.focusstart.task2;

import java.io.FileNotFoundException;
import java.util.List;

public class ShapesPrinter {
    public void Run(Printer printer, String inputFileName) throws FileNotFoundException {
        FileReader fileReader = new FileReader(inputFileName);
        List<String> listArgs = fileReader.getFiguresArgs();
        Shape shape = new ShapeParser().parse(listArgs);
        String formatedShape = new ShapeFormater().format(shape);
        printer.print(formatedShape);
    }
}
