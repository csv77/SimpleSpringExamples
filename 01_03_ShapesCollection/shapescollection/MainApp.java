package shapescollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext("beans.xml");
		PrintShapes printShapes = context.getBean(PrintShapes.class);
		printShapes.printShapes();
	}

}
