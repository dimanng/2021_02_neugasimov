import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.cft.focusstart.task2.Circle;

public class CircleMethodsTest {
    Circle circle = new Circle(10);

    @Test
    public void circleGetPerimeterTest(){
        double perimeter = circle.getPerimeter();
        Assertions.assertEquals(62.83, perimeter);
    }

    @Test
    public void circleGetAreaTest(){
        double area = circle.getArea();
        Assertions.assertEquals(314.16, area);
    }

    @Test
    public void circleGetRadiusTest(){
        double radius = circle.getRadius();
        Assertions.assertEquals(10, radius);
    }

    @Test
    public void circleGetDiameterTest(){
        double diameter = circle.getDiameter();
        Assertions.assertEquals(20, diameter);
    }
}
