package shapeswithaspect;

public class MessageAspect {
	
	public void messageBefore() {
		System.out.println("Area of the circle will be calculated.");
	}
	
	public void messageAfter() {
		System.out.println("Area of the circle was calculated.");
	}
}
