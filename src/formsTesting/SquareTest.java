package formsTesting;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SquareTest {

    @Test
    public void calculateArea() {
        Square square = new Square(1, 1, 5);
        double result = square.calculateArea();
        Assert.assertEquals(result, square.getRectangle().getLength() * square.getRectangle().getWidth()); // length and width = same size
    }

    @Test
    public void calculateCircumference() {
        Square square = new Square(1, 1, 5);
        double result = square.calculateCircumference();
        Assert.assertEquals(result, square.getRectangle().getLength() * 4);
    }

}
