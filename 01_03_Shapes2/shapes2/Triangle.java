package shapes2;

public class Triangle implements Shape {
	double a, b, c;

	public Triangle(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
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
		return "Triangle area: " + getArea() + "\nTriangle perimeter: " + getPerimeter();
	}
}
