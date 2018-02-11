package shapescollectionwithaspects;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PrintShapesConfig {
	
	@Bean
	public Circle circle() {
		return new Circle(10);
	}
	
	@Bean
	public Rectangle rectangle() {
		return new Rectangle(20, 20);
	}
	
	@Bean
	public Triangle triangle() {
		return new Triangle(20, 20, 20);
	}
}
