package shapes;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:rectangle.properties")
public class Rectangle implements Shape {
	double a, b;
		
	public Rectangle(@Value("${rectangle.a}") String a,
			@Value("${rectangle.b}") String b) {
		this.a = Double.parseDouble(a);
		this.b = Double.parseDouble(b);
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
