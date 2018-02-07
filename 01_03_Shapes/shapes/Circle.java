package shapes;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:circle.properties")
public class Circle implements Shape {
	double radius;
	
	public Circle(@Value("${circle.radius}") String radius) {
		this.radius = Double.parseDouble(radius);
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
