import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import ru.cft.focusstart.task2.utils.FilePrinter;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FilePrinterTest {

    static File testFile;
    static FilePrinter testPrinter;
    @BeforeAll
    static void fileSettingsMethod(){
        testFile = new File("testfileprint.txt");
        testPrinter = new FilePrinter(testFile.toString());
    }

    @AfterAll
    static void deleteFileMethod(){
        testFile.delete();
    }

    @Test
    public void printToFileTest(){
        List<String> listActual = new ArrayList<>();
        listActual.add("rectangle");
        listActual.add("5 10");

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
        Assertions.assertEquals(listExpected, listActual);
    }
}
