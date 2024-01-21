package formsTesting;

public class Rectangle extends Form {

	private double width;
	private double length;

	public Rectangle(double x, double y, double width, double length) {
		super(x, y);

		// Check length + width!!!
		if (width <= 0 || length <= 0) {
			throw new IllegalArgumentException("Width and length must be greater than zero.");
		}

		this.width = width;
		this.length = length;
	}

	// Getter + Setter
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	// Methoden
	public double calculateArea() {
		return this.width * this.length;
	}

	public double calculateCircumference() {
		return 2 * (this.width + this.length);
	}

	// toString
	public String toString() {
		return "Rectangle (" + this.getX() + "|" + this.getY() + ") with width = "
				+ this.getWidth() + " and length = " + this.getLength();
	}

}
