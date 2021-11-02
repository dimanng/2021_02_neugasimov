package ru.cft.focusstart.task2;

import java.io.FileNotFoundException;

public class Program {

    public static void main(String[] args) throws FileNotFoundException {
        ShapesPrinter printer = new ShapesPrinter();
        switch(args[0]){
            case("console"):
                printer.Run(new ConsolePrinter(), args[1]);
                break;
            case("file"):
                printer.Run(new FilePrinter(args[1]), args[2]);
                break;
            default:
                printer.Run(new ConsolePrinter(), args[1]);
                break;
        }

    }
}
