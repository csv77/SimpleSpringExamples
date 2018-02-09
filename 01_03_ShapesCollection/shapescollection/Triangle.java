package shapescollection;

import java.text.DecimalFormat;

public class Triangle implements Shape {
	double a, b, c;
	DecimalFormat formatter;

	public Triangle(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public void setFormatter(DecimalFormat formatter) {
		this.formatter = formatter;
	}

	@Override
	public double getArea() {
		double s = getPerimeter() / 2;
		return Math.sqrt(s * (s - a) * (s - b) * (s - c));
	}

	@Override
	public double getPerimeter() {
		return a + b + c;
	}
	
	@Override
	public String toString() {
		return "Triangle area: " + formatter.format(getArea()) +
				"\nTriangle perimeter: " + formatter.format(getPerimeter());
	}
}
