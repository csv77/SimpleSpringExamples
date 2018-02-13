package shapeswithaspect2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ShapeConfig.class);
		Circle circle = context.getBean(Circle.class);
		circle.printArea();
		((AnnotationConfigApplicationContext)context).close();
	}
}
