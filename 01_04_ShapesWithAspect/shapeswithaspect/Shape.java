package shapeswithaspect;

import java.text.DecimalFormat;

public abstract class Shape {
	
	DecimalFormat formatter;
	
	public abstract double getArea();
	
	public abstract double getPerimeter();
	
	public void setFormatter(DecimalFormat formatter) {
		this.formatter = formatter;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " area: " + formatter.format(getArea()) +
				"\n" + getClass().getSimpleName() + " perimeter: " + formatter.format(getPerimeter());
	}
}
