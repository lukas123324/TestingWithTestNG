package formsTesting;

public class Triangle extends Form {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double x, double y, double sideA, double sideB, double sideC) {
        super(x, y);

        // check the Triangle!
        if (sideA <= 0 || sideB <= 0 || sideC <= 0 && (sideA + sideB < sideC) && (sideA + sideC < sideB) && (sideB + sideC < sideA)) {
            throw new IllegalArgumentException("Triangle sides must be greater than zero.");
        }

        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    // Getter + Setter
    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    // Methoden

    /**
     * calculates the area of this triangle.
     * @return area
     */
    public double calculateArea() {
        double s = (this.sideA + this.sideB + this.sideC) / 2; // half circumference
        return Math.sqrt(s * (s - this.sideA) * (s - this.sideB) * (s - this.sideC)); // = Heronsche Formel
    }

    /**
     * calculates the circumference of this triangle.
     * @return circumference
     */
    public double calculateCircumference() {
        return this.sideA + this.sideB + this.sideC;
    }

    // toString
    public String toString() {
        return "Triangle (" + this.getX() + "|" + this.getY() + ") with sides: " +
                "A=" + sideA + ", B=" + sideB + ", C=" + sideC;
    }

}
