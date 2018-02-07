package shapes;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:triangle.properties")
public class Triangle implements Shape {
	double a, b, c;

	public Triangle(@Value("${triangle.a}") String a,
			@Value("${triangle.b}") String b,
			@Value("${triangle.c}") String c) {
		this.a = Double.parseDouble(a);
		this.b = Double.parseDouble(b);
		this.c = Double.parseDouble(c);
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
