package shapeswithaspect;

public class MessageAspect {
	
	public void messageBefore() {
		System.out.println("Before calculating the area and perimeter!");
	}
	
	public void messageAfter() {
		System.out.println("After calculating the area and perimeter!");
	}
}
