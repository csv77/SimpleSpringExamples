package interest;

public class FixedRateCalculator implements RateCalculator {
	double rate;
	
	public void setRate(double rate) {
		this.rate = rate;
	}

	@Override
	public double getAnnualRate() {
		return rate;
	}

	@Override
	public double getMonthlyRate() {
		return rate / 12;
	}

	@Override
	public double getDailyRate() {
		return rate / 365;
	}

}
