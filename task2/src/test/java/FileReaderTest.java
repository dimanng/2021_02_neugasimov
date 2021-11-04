import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.cft.focusstart.task2.FileReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class FileReaderTest {

    @Test
    public void getArgsFromFileTest() throws FileNotFoundException {
        File testFile = new File("testfileread.txt");
        try (PrintWriter printWriter = new PrintWriter(testFile)){
            printWriter.println("circle");
            printWriter.println("5");
        }
        catch (IOException exception){
            exception.printStackTrace();
        }
        FileReader fileReader = new FileReader(testFile.toString());
        List<String> realList = new ArrayList<>();
        realList.add("circle");
        realList.add("5");
        List<String> fileReaderList = fileReader.getFiguresArgs();
        testFile.delete();
        Assertions.assertEquals(fileReaderList, realList);
    }
}
