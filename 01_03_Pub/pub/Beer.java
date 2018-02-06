package pub;

import org.springframework.stereotype.Component;

@Component
@Cold
public class Beer implements Drink {
	
	@Override
	public void drink() {
		System.out.println("Drink a beer!");
	}
}
