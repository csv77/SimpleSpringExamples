package simplecalculator;

public class Calculator {
	Numbers numbers;
	String nothing;
	
	public Calculator() {
	}

	public Calculator(Numbers numbers) {
		this.numbers = numbers;
	}
	
	public void setNumbers(Numbers numbers) {
		this.numbers = numbers;
	}

	public double sum() {
		return numbers.getA() + numbers.getB();
	}
	
	public double subtract() {
		return numbers.getA() - numbers.getB();
	}
	
	public double multiply() {
		return numbers.getA() * numbers.getB();
	}
	
	public double divide() {
		return numbers.getA() / numbers.getB();
	}
}
