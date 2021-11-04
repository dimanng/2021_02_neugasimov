package ru.cft.focusstart.task2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileNotFoundException;

public class Program {

    private static final Logger log = LoggerFactory.getLogger(Program.class.getName());

    public static void main(String[] args) throws FileNotFoundException {
        ShapesPrinter printer = new ShapesPrinter();
        log.info("Program is running...");
        if(args.length == 0){
            log.error("No arguments for the program");
            throw new IllegalArgumentException("Не указаны аргументы программы, продолжение невозможно");
        }
        switch(args[0]){
            case("-c"):
                if(args.length <= 1){
                    log.error("No input file name");
                    throw new IllegalArgumentException("Не указано имя файла с параметрами фигуры");
                }
                printer.Run(new ConsolePrinter(), args[1]);
                log.info("Console print mode selected");
                break;
            case("-f"):
                if(args.length <= 2){
                    log.error("No output file name");
                    throw new IllegalArgumentException("Не указано имя файла для вывода");
                }
                printer.Run(new FilePrinter(args[2]), args[1]);
                log.info("File print mode selected");
                break;
            default:
                log.error("No arguments found");
                throw new IllegalArgumentException("Не указаны аргументы программы");
        }
    }
}
