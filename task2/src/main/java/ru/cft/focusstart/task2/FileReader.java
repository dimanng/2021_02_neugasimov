package ru.cft.focusstart.task2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReader {
    String fileName;

    public FileReader(String fileName) {
        this.fileName = fileName;
    }

    public ArrayList getFiguresArgs() throws FileNotFoundException {
        ArrayList list = new ArrayList();
        try (Scanner scanner = new Scanner(new FileInputStream(fileName))) {
            list.add(scanner.nextLine());
            int count = 0;
            while(scanner.hasNext()){
                list.add(scanner.nextDouble());
                count++;
                if (count > 3){
                    System.out.println("Ошибка! Проверьте количество параметров");
                    break;
                }
            }
        }
        return list;
    }
}
