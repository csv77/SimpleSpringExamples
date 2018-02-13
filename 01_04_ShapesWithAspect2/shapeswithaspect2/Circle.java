package shapeswithaspect2;

public class Circle extends Shape {
	double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}

	public String printArea() {
		String result = formatter.format(getArea());
		System.out.println(result);
		return result;
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
