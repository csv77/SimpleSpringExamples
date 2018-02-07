package shapes;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ShapeConfig.class);
		Rectangle rectangle = context.getBean(Rectangle.class);
		Circle circle = context.getBean(Circle.class);
		Triangle triangle = context.getBean(Triangle.class);
		
		System.out.println(rectangle);
		System.out.println(circle);
		System.out.println(triangle);
		context.close();
	}
}
