package shapeswithaspect2;

import java.text.DecimalFormat;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class ShapeConfig {
	
	@Bean
	public DecimalFormat decimalFormat() {
		return new DecimalFormat("###,###.00");
	}
	
	@Bean
	public Circle circle() {
		return new Circle(10);
	}
	
	@Bean
	public MessageAspect messageAspect() {
		return new MessageAspect();
	}
}
