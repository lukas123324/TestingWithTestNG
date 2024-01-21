package formsTesting;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TriangleTest {

    @Test
    public void calculateArea() {
        Triangle triangle = new Triangle(1, 1, 2, 3, 2.5);
        double result = triangle.calculateArea();
        double s = (triangle.getSideA() + triangle.getSideB() + triangle.getSideC()) / 2;
        Assert.assertEquals(result, Math.sqrt(s * (s - triangle.getSideA()) * (s - triangle.getSideB()) * (s - triangle.getSideC())));
    }

    @Test
    public void calculateCircumference() {
        Triangle triangle = new Triangle(1, 1, 2, 3, 2.5);
        double result = triangle.calculateCircumference();
        Assert.assertEquals(result, triangle.getSideA() + triangle.getSideB() + triangle.getSideC());
    }

}
