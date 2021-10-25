package ru.cft.focusstart.task2;

import java.io.FileNotFoundException;

public class Program {

    public static void main(String[] args) throws FileNotFoundException {
        FileReader fileReader = new FileReader();

        System.out.println(fileReader.getFiguresArgs());
    }
}
