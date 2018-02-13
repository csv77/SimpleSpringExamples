package shapeswithaspect2;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MessageAspect {
	
	@Pointcut("execution(** shapeswithaspect2.Circle.printArea(..))")
	public void printArea() {}
	
	@Before("printArea()")
	public void messageBefore() {
		System.out.println("Area of the circle will be calculated.");
	}
	
	@AfterReturning(pointcut="printArea()", returning="result")
	public void messageAfter(Object result) {
		System.out.println("Area of the circle was calculated. It is " + (String)result + ".");
	}
}
