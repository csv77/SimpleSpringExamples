package pub;

import org.springframework.stereotype.Component;

@Component
@Scotch
public class Whiskey implements Drink {

	@Override
	public void drink() {
		System.out.println("Drink a flass whiskey!");
	}

}
