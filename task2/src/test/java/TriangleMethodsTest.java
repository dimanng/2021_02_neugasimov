import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.cft.focusstart.task2.shapes.Triangle;

public class TriangleMethodsTest {

    @Test
    public void trianglePerimeterTest(){
        Triangle triangle = new Triangle(5, 5, 5);
        double perimeter = triangle.getPerimeter();
        Assertions.assertEquals(15, perimeter);
    }

    @Test
    public void triangleAreaTest(){
        Triangle triangle = new Triangle(5, 5, 5);
        double area = triangle.getArea();
        Assertions.assertEquals(10.83, area);
    }

    @Test
    public void triangleGetSide1Test(){
        Triangle triangle = new Triangle(5, 5, 5);
        double side1 = triangle.getSide1();
        Assertions.assertEquals(5, side1);
    }

    @Test
    public void triangleGetSide2Test(){
        Triangle triangle = new Triangle(5, 5, 5);
        double side2 = triangle.getSide2();
        Assertions.assertEquals(5, side2);
    }

    @Test
    public void triangleGetSide3Test(){
        Triangle triangle = new Triangle(5, 5, 5);
        double side3 = triangle.getSide3();
        Assertions.assertEquals(5, side3);
    }

    @Test
    public void triangleGetAngle1Test(){
        Triangle triangle = new Triangle(5, 5, 5);
        double angle1 = triangle.getAngle1();
        Assertions.assertEquals(60.0, angle1);
    }

    @Test
    public void triangleGetAngle2Test(){
        Triangle triangle = new Triangle(5, 5, 5);
        double angle2 = triangle.getAngle2();
        Assertions.assertEquals(60.0, angle2);
    }

    @Test
    public void triangleGetAngle3Test(){
        Triangle triangle = new Triangle(5, 5, 5);
        double angle3 = triangle.getAngle3();
        Assertions.assertEquals(60.0, angle3);
    }
}
