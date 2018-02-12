package shapescollectionwithaspects;

import java.text.DecimalFormat;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ShapesConfig {
	
	@Bean
	public DecimalFormat decimalFormat() {
		return new DecimalFormat("###,###.00");
	}
}
