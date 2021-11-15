package ru.cft.focusstart.task2.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConsolePrinter implements Printer{
    private static final Logger log = LoggerFactory.getLogger(Printer.class.getName());
    @Override
    public void print(String string) {
        log.info("Start print to the console");
        System.out.println(string);
        log.info("End print to the console");
    }
}
