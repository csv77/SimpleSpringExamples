package shapescollection;

import java.text.DecimalFormat;

public class Circle implements Shape {
	double radius;
	DecimalFormat formatter;
	
	public Circle(double radius) {
		this.radius = radius;
	}

	public void setFormatter(DecimalFormat formatter) {
		this.formatter = formatter;
	}

	@Override
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public double getPerimeter() {
		return Math.PI * 2 * radius;
	}
	
	@Override
	public String toString() {
		return "Circle area: " + formatter.format(getArea()) +
				"\nCircle perimeter: " + formatter.format(getPerimeter());
	}
}
