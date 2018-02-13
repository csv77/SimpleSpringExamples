package shapescollection2;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
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
