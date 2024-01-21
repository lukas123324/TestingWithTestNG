package formsTesting;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RectangleTest {

    @Test
    public void calculateArea() {
        Rectangle rectangle = new Rectangle(1, 1, 5, 4);
        double result = rectangle.calculateArea();
        Assert.assertEquals(result, rectangle.getWidth() * rectangle.getLength());
    }

    @Test
    public void calculateCircumference() {
        Rectangle rectangle = new Rectangle(1, 1, 5, 4);
        double result = rectangle.calculateCircumference();
        Assert.assertEquals(result, rectangle.getLength() * 2 + rectangle.getWidth() * 2);
    }

}
