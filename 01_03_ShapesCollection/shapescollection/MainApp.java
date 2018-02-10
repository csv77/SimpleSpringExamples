package shapescollection;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		GenericXmlApplicationContext context = new GenericXmlApplicationContext();
		context.getEnvironment().setActiveProfiles("permanent", "smallshapes");
		context.load("beansofshapescollection.xml");
		context.refresh();
		PrintShapes printShapes = context.getBean(PrintShapes.class);
		printShapes.printShapes();
		((GenericXmlApplicationContext)context).close();
	}
}
