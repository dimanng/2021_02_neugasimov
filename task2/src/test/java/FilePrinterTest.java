import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.cft.focusstart.task2.utils.FilePrinter;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FilePrinterTest {

    @Test
    public void printToFileTest(){
        List<String> listActual = new ArrayList<>();
        listActual.add("rectangle");
        listActual.add("5 10");
        File testFile = new File("testfileprint.txt");
        FilePrinter testPrinter = new FilePrinter(testFile.toString());
        String listStringActual = String.join("\n", listActual);
        testPrinter.print(listStringActual);
        List<String> listExpected = new ArrayList<>();
        try (Scanner scanner = new Scanner(new FileInputStream(testFile))) {
            while(scanner.hasNext()){
                listExpected.add(scanner.nextLine());
            }
        } catch (FileNotFoundException exception){
            exception.printStackTrace();
        }
        testFile.delete();
        Assertions.assertEquals(listExpected, listActual);
    }
}
