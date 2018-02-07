package pub;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@Scotch
@PropertySource("classpath:pub.properties")
public class Whiskey implements Drink {
	private String text;
	
	public Whiskey(@Value("${whiskey.text}") String text) {
		this.text = text;
	}

	@Override
	public void drink() {
		System.out.println("Drink a glass of whiskey!" + " " + text);
	}

}
