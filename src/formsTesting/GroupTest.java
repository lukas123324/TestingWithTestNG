package formsTesting;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupTest {

    Circle circle1 = new Circle(1, 1, 3); // 28
    Circle circle2 = new Circle(1, 1, 4); // 50
    Rectangle rectangle1 = new Rectangle(1, 1, 5, 4); // 20
    Rectangle rectangle2 = new Rectangle(1, 1, 5, 6); // 30
    Square square1 = new Square(1, 1, 7); // 49
    Square square2 = new Square(1, 1, 5); // 25

    @Test
    public void calculateArea() {
        Group group = new Group();
        group.addForm(circle1); // 28
        group.addForm(rectangle1); // 20
        group.addForm(square1); // 49
        double result = group.calculateArea();
        Assert.assertEquals(result, (Math.pow(circle1.getRadius(), 2)*Math.PI) + (rectangle1.getLength() * rectangle1.getWidth()) + (square1.getRectangle().getLength() * square1.getRectangle().getWidth()));
    }

    @Test
    public void calculateCircumference() {
        Group group = new Group();
        group.addForm(circle2);
        group.addForm(rectangle2);
        group.addForm(square2);
        double result = group.calculateCircumference();
        Assert.assertEquals(result, (2*circle2.getRadius()*Math.PI) + (rectangle2.getLength() * 2 + rectangle2.getWidth() * 2) + (square2.getRectangle().getLength() * 4));
    }

    @Test
    public void findBiggestForm() {
        Group group = new Group();
        group.addForm(circle1);
        group.addForm(rectangle1);
        group.addForm(square1);
        group.addForm(circle2);
        group.addForm(rectangle2);
        group.addForm(square2);
        Form result = group.findBiggestForm();
        Assert.assertEquals(result, circle2);
    }

}
