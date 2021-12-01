import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.cft.focusstart.task2.shapes.Circle;

public class CircleMethodsTest {

    @Test
    public void circleGetPerimeterTest(){
        Circle circle = new Circle(10);
        double perimeter = circle.getPerimeter();
        Assertions.assertEquals(62.83, perimeter, 0.01);
    }

    @Test
    public void circleGetAreaTest(){
        Circle circle = new Circle(10);
        double area = circle.getArea();
        Assertions.assertEquals(314.16, area, 0.01);
    }

    @Test
    public void circleGetRadiusTest(){
        Circle circle = new Circle(10);
        double radius = circle.getRadius();
        Assertions.assertEquals(10, radius);
    }

    @Test
    public void circleGetDiameterTest(){
        Circle circle = new Circle(10);
        double diameter = circle.getDiameter();
        Assertions.assertEquals(20, diameter);
    }
}
