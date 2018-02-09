package shapescollection;

import java.util.List;

public class PrintShapes {
	private List<Shape> listOfShapes;

	public PrintShapes(List<Shape> listOfShapes) {
		this.listOfShapes = listOfShapes;
	}
	
	public void printShapes() {
		for(Shape shape : listOfShapes) {
			System.out.println(shape);
		}
	}
}
