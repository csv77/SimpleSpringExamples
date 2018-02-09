package shapes2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext(new String[] {"beans.xml", "circle.xml"});
		Rectangle rectangle = context.getBean(Rectangle.class);
		Circle circle = context.getBean(Circle.class);
		Triangle triangle = context.getBean(Triangle.class);
		
		System.out.println(rectangle);
		System.out.println(circle);
		System.out.println(triangle);
	}
}
