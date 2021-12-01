package ru.cft.focusstart.task2;

import ru.cft.focusstart.task2.shapes.Shape;
import ru.cft.focusstart.task2.utils.FileReader;
import ru.cft.focusstart.task2.utils.Printer;
import ru.cft.focusstart.task2.utils.ShapeParser;

import java.io.FileNotFoundException;
import java.util.List;

public class ShapesPrinter {
    public void run(Printer printer, String inputFileName) throws FileNotFoundException {
        FileReader fileReader = new FileReader(inputFileName);
        List<String> listArgs = fileReader.getFiguresArgs();
        Shape shape = new ShapeParser(listArgs).parse();
        String formattedShape = shape.getInfo();
        printer.print(formattedShape);
    }
}
