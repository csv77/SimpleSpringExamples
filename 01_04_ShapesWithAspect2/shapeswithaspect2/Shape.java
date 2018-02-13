package shapeswithaspect2;

import java.text.DecimalFormat;

import org.springframework.beans.factory.annotation.Autowired;

public abstract class Shape {
	
	DecimalFormat formatter;
	
	public abstract double getArea();
	
	public abstract double getPerimeter();
	
	@Autowired
	public void setFormatter(DecimalFormat formatter) {
		this.formatter = formatter;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " area: " + formatter.format(getArea()) +
				"\n" + getClass().getSimpleName() + " perimeter: " + formatter.format(getPerimeter());
	}
}
