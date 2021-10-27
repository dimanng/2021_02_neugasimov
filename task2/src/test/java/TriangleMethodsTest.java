import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.cft.focusstart.task2.Triangle;

public class TriangleMethodsTest {

    Triangle triangle = new Triangle(5, 5, 5);

    @Test
    public void trianglePerimeterTest(){
        double perimeter = triangle.getPerimeter();
        Assertions.assertEquals(15, perimeter);
    }

    @Test
    public void triangleAreaTest(){
        double area = triangle.getArea();
        Assertions.assertEquals(10.8, area);
    }

    @Test
    public void triangleGetSide1Test(){
        double side1 = triangle.getSide1();
        Assertions.assertEquals(5, side1);
    }

    @Test
    public void triangleGetSide2Test(){
        double side2 = triangle.getSide2();
        Assertions.assertEquals(5, side2);
    }

    @Test
    public void triangleGetSide3Test(){
        double side3 = triangle.getSide3();
        Assertions.assertEquals(5, side3);
    }

    @Test
    public void triangleGetAngle1Test(){
        double angle1 = triangle.getAngle1();
        Assertions.assertEquals(60.0, angle1);
    }

    @Test
    public void triangleGetAngle2Test(){
        double angle2 = triangle.getAngle2();
        Assertions.assertEquals(60.0, angle2);
    }

    @Test
    public void triangleGetAngle3Test(){
        double angle3 = triangle.getAngle3();
        Assertions.assertEquals(60.0, angle3);
    }
}
