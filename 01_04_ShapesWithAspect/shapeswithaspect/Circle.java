package shapeswithaspect;

public class Circle extends Shape {
	double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}

	public void printArea() {
		System.out.println(formatter.format(getArea()));;
	}

	@Override
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public double getPerimeter() {
		return Math.PI * 2 * radius;
	}
}
