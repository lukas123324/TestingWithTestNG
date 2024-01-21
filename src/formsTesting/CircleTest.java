package formsTesting;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CircleTest {

    @Test
    public void calculateArea() {
        Circle circle = new Circle(1, 1, 3);
        double result = circle.calculateArea();
        Assert.assertEquals(result, Math.pow(circle.getRadius(), 2)*Math.PI); // = PI*(r^2)

    }

    @Test
    public void calculateCircumference() {
        Circle circle = new Circle(1, 1, 3);
        double result = circle.calculateCircumference();
        Assert.assertEquals(result, 2*circle.getRadius()*Math.PI); // = 2*r*PI
    }

}