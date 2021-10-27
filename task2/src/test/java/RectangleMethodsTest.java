import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.cft.focusstart.task2.Rectangle;

public class RectangleMethodsTest {
    Rectangle rectangle = new Rectangle(10, 5);

    @Test
    public void rectangleGetPerimeterTest(){
        double perimeter = rectangle.getPerimeter();
        Assertions.assertEquals(30, perimeter);
    }

    @Test
    public void rectangleGetAreaTest(){
        double area = rectangle.getArea();
        Assertions.assertEquals(50, area);
    }

    @Test
    public void rectangleGetSide1Test(){
        double side1 = rectangle.getSide1();
        Assertions.assertEquals(10, side1);
    }

    @Test
    public void rectangleGetSide2Test(){
        double side2 = rectangle.getSide2();
        Assertions.assertEquals(5, side2);
    }

    @Test
    public void rectangleGetDiagonalTest(){
        double diagonal = rectangle.getDiagonal();
        Assertions.assertEquals(11.18, diagonal);
    }

}
