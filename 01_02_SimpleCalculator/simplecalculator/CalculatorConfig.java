package simplecalculator;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CalculatorConfig {
		
	@Bean
	public Calculator calculator(Numbers numbers) {
		Calculator calculator = new Calculator();
		calculator.setNumbers(numbers);
		return calculator;
	}
}
