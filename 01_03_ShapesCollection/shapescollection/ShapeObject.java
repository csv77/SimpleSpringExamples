package shapescollection;

import java.text.DecimalFormat;

public abstract class ShapeObject implements Shape {
	DecimalFormat formatter;

	public void setFormatter(DecimalFormat formatter) {
		this.formatter = formatter;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " area: " + formatter.format(getArea()) +
				"\n" + getClass().getSimpleName() + " perimeter: " + formatter.format(getPerimeter());
	}
}
