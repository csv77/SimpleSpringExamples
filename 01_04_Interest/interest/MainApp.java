package interest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext("calculator.xml");
		InterestCalculator calculator = (InterestCalculator)context.getBean("interestCalculator");
		System.out.println("The interest is: " + calculator.calculate(100000, 3));
		((GenericXmlApplicationContext)context).close();
	}
}
