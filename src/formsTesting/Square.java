package formsTesting;

public class Square extends Form {

	private Rectangle rectangle;

	public Square(double x, double y, double width) {
		super(x, y);
		rectangle = new Rectangle(x, y, width, width);
	}

	// Getter + Setter
	public Rectangle getRectangle() {
		return rectangle;
	}

	public void setRectangle(Rectangle rectangle) {
		this.rectangle = rectangle;
	}

	// Methoden
	public double calculateArea() {
		return this.rectangle.calculateArea();
	}

	public double calculateCircumference() {
		return 4 * this.rectangle.getWidth();
	}

	// toString
	public String toString() {
		return "Square (" + this.getX() + "|" + this.getY() + ") with width = "
				+ this.rectangle.getWidth();
	}


}
