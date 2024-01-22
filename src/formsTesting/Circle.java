package formsTesting;

public class Circle extends Form {

    private double radius;

    public Circle(double x, double y, double radius) {
        super(x, y);

        // check radius!!!
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be greater than zero.");
        }

        this.radius = radius;
    }

    // Getter + Setter

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Methoden

    /**
     * calculates the area of this circle.
     * @return area
     */
    public double calculateArea() {
        return Math.pow(this.radius, 2) * Math.PI;
    }

    /**
     * calculates the circumference of this circle.
     * @return circumference
     */
    public double calculateCircumference() {
        return 2 * this.radius * Math.PI;
    }

    // toString
    public String toString() {
        return "Circle (" + this.getX() + "|" + this.getY() + ") with radius = " + this.getRadius();
    }
}
