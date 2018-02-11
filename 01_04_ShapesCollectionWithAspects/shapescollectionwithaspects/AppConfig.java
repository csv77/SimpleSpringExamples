package shapescollectionwithaspects;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({PrintShapesConfig.class, ShapesConfig.class})
public class AppConfig {
		
}
