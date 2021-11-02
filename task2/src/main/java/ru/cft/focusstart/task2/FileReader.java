package ru.cft.focusstart.task2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileReader {
    String fileName;

    public FileReader(String fileName) {
        this.fileName = fileName;
    }

    private static final Logger log = LoggerFactory.getLogger(FileReader.class.getName());

    public List<String> getFiguresArgs() throws FileNotFoundException {
        List<String> list = new ArrayList();
        try (Scanner scanner = new Scanner(new FileInputStream(fileName))) {
            log.info("File {} opened", fileName);
            while(scanner.hasNext()){
                list.add(scanner.nextLine());
            }
        }
        return list;
    }
}
