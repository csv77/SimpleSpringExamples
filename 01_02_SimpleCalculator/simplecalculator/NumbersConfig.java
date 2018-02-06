package simplecalculator;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NumbersConfig {

	@Bean
	public Numbers numbers() {
		return new Numbers();
	}
}
