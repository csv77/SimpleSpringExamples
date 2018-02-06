package simplecalculator;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@Import({CalculatorConfig.class, NumbersConfig.class})
public class AppConfig {

}
