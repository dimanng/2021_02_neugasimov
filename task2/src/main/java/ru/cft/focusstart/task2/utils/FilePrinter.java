package ru.cft.focusstart.task2.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.PrintWriter;

public class FilePrinter implements Printer{
    private static final Logger log = LoggerFactory.getLogger(FilePrinter.class.getName());

    private String filename;

    public String getFilename() {
        return filename;
    }

    public FilePrinter(String filename) {
        this.filename = filename;
    }

    @Override
    public void print(String string)  {
        try(PrintWriter printWriter = new PrintWriter(getFilename())){
            log.info("Start print to the file");
            printWriter.println(string);
            log.info("End print to the file");
        } catch (IOException e) {
            log.error("File write error " + e.getMessage());
        }
    }
}
