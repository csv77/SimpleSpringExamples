package shapes;

import org.springframework.stereotype.Component;

@Component
public class Rectangle implements Shape {
	double a, b;
		
	public Rectangle(double a, double b) {
		this.a = a;
		this.b = b;
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
		return "Rectangle area: " + getArea() + "\nRectangle perimeter: " + getPerimeter();
	}
}
