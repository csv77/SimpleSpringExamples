package interest

class SimpleInterestCalculator implements InterestCalculator {

	double rate

	public double calculate(double amount, double year) {
		return amount * Math.pow(1 + rate, year) - amount
	}
	
}
