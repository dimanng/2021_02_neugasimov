package ru.cft.focusstart.task2;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FilePrinter implements Printer{
    String filename;
    public FilePrinter(String filename) {
        this.filename = filename;
    }

    public static void main(String[] args) {
        FilePrinter filePrinter = new FilePrinter(args[0]);
    }

    @Override
    public void print(String string) {

    }
}
