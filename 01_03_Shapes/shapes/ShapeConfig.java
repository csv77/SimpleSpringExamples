package shapes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.env.Environment;

@Configuration
@ComponentScan
@PropertySources({@PropertySource("classpath:circle.properties"),
		@PropertySource("classpath:rectangle.properties"),
		@PropertySource("classpath:triangle.properties")})
public class ShapeConfig {
	
	@Autowired
	Environment environment;
	
	@Bean
	Circle circle() {
		return new Circle(environment.getProperty("circle.radius", Double.class));
	}
	
	@Bean
	Triangle triangle() {
		return new Triangle(environment.getProperty("triangle.a", Double.class),
				environment.getProperty("triangle.b", Double.class),
				environment.getProperty("triangle.c", Double.class));
	}
	
	@Bean
	Rectangle rectangle() {
		return new Rectangle(environment.getProperty("rectangle.a", Double.class),
				environment.getProperty("rectangle.b", Double.class));
	}
}
