package interest

class SimpleInterestCalculator implements InterestCalculator {

	RateCalculator rateCalculator

	public double calculate(double amount, double year) {
		return amount * Math.pow(1 + rateCalculator.getAnnualRate(), year) - amount
	}
	
}
