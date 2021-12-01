import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.cft.focusstart.task2.shapes.Rectangle;

public class RectangleMethodsTest {

    @Test
    public void rectangleGetPerimeterTest(){
        Rectangle rectangle = new Rectangle(10, 5);
        double perimeter = rectangle.getPerimeter();
        Assertions.assertEquals(30, perimeter);
    }

    @Test
    public void rectangleGetAreaTest(){
        Rectangle rectangle = new Rectangle(10, 5);
        double area = rectangle.getArea();
        Assertions.assertEquals(50, area);
    }

    @Test
    public void rectangleGetSide1Test(){
        Rectangle rectangle = new Rectangle(10, 5);
        double side1 = rectangle.getSide1();
        Assertions.assertEquals(10, side1);
    }

    @Test
    public void rectangleGetSide2Test(){
        Rectangle rectangle = new Rectangle(10, 5);
        double side2 = rectangle.getSide2();
        Assertions.assertEquals(5, side2);
    }

    @Test
    public void rectangleGetDiagonalTest(){
        Rectangle rectangle = new Rectangle(10, 5);
        double diagonal = rectangle.getDiagonal();
        Assertions.assertEquals(11.18, diagonal, 0.01);
    }

}
