package simplecalculator;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Calculator calculator = context.getBean(Calculator.class);
		Numbers numbers = context.getBean(Numbers.class);
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Add the first number: ");
		boolean inputNotOk = true;
		while(inputNotOk) {
			try {
				double i = input.nextDouble();
				inputNotOk = false;
				numbers.setA(i);
			}
			catch(InputMismatchException ex) {
				System.out.print("Wrong input, please try again: ");
				input.next();
			}
		}
		
		System.out.print("Add the second number: ");
		inputNotOk = true;
		while(inputNotOk) {
			try {
				double i = input.nextDouble();
				inputNotOk = false;
				numbers.setB(i);
			}
			catch(InputMismatchException ex) {
				System.out.println("Wrong input, please try again: ");
				input.next();
			}
		}
		
		System.out.println(numbers.getA() + " + " + numbers.getB() + " = " + calculator.sum());
		System.out.println(numbers.getA() + " - " + numbers.getB() + " = " + calculator.subtract());
		System.out.println(numbers.getA() + " * " + numbers.getB() + " = " + calculator.multiply());
		System.out.println(numbers.getA() + " / " + numbers.getB() + " = " + calculator.divide());
		
		input.close();
		context.close();
	}

}
