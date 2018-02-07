package shapes;

import org.springframework.stereotype.Component;

@Component
public class Circle implements Shape {
	double radius;
	
	public Circle(double radius) {
		this.radius = radius;
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
		return "Circle area: " + getArea() + "\nCircle perimeter: " + getPerimeter();
	}
}
