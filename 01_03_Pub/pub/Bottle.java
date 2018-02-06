package pub;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Bottle {
	@Autowired
	@Scotch
	Drink drink;
	String text;
	
	public Bottle(Drink drink) {
		this.drink = drink;
	}

	public Bottle() {
	}
	
	public void setString(String text) {
		this.text = text;
	}
	
	public void getDrunk() {
		drink.drink();
		System.out.println(text);
	}
}
