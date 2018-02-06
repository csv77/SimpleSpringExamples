package pub;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigDrinking.class);
		Bottle bottle1 = context.getBean(Bottle.class);
		Bottle bottle2 = context.getBean(Bottle.class);
		bottle1.setString("It was good!");
		bottle2.setString("It was much better!");
		bottle1.getDrunk();
		bottle2.getDrunk();
		
		context.close();
	}
}
