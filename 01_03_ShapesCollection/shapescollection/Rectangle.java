package shapescollection;

import java.text.DecimalFormat;

public class Rectangle implements Shape {
	double a, b;
	DecimalFormat formatter;
		
	public Rectangle(double a, double b) {
		this.a = a;
		this.b = b;
	}

	public void setFormatter(DecimalFormat formatter) {
		this.formatter = formatter;
	}

	@Override
	public double getArea() {
		return a * b;
	}

	@Override
	public double getPerimeter() {
		return 2 * (a + b);
	}

	@Override
	public String toString() {
		return "Rectangle area: " + formatter.format(getArea()) +
				"\nRectangle perimeter: " + formatter.format(getPerimeter());
	}
}
