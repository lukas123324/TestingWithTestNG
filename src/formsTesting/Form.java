package formsTesting;

public abstract class Form {

    private double x;
    private double y;

    public Form(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Getter + Setter
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    //Methoten

    /**
     * calculates the area of this form.
     * @return area
     */
    public abstract double calculateArea();

    /**
     * calculates the circumference of this form.
     * @return circumference
     */
    public abstract double calculateCircumference();

}
