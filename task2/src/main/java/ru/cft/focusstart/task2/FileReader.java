package ru.cft.focusstart.task2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {
    public String getFiguresArgs() throws FileNotFoundException {
        StringBuilder params = new StringBuilder();
        try (Scanner scanner = new Scanner(new FileInputStream("C:\\FocusStart\\task2\\src\\main\\java\\ru\\cft\\focusstart\\task2\\input.txt"))){
            for(int i = 0; i < 2; i++){
                params.append(scanner.nextLine());
            }

        }
        return params.toString();
    }


}
