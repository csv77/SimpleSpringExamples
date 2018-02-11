package shapescollectionwithaspects;

import java.text.DecimalFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public abstract class Shape {
	
	@Autowired
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
