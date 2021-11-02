package ru.cft.focusstart.task2;

public class ConsolePrinter implements Printer{
    @Override
    public void print(String string) {
        System.out.println(string);
    }
}
