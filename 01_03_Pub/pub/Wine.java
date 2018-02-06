package pub;

import org.springframework.stereotype.Component;

@Component
@Red
public class Wine implements Drink {
	
	@Override
	public void drink() {
		System.out.println("Drink a glass of wine!");
	}

}
