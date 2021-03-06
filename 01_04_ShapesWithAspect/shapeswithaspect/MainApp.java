package shapeswithaspect;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext("appconfig.xml");
		Circle circle = context.getBean(Circle.class);
		circle.printArea();
		((GenericXmlApplicationContext)context).close();
	}
}
