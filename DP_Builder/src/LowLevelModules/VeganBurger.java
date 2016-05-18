package LowLevelModules;

import HighLevelModules.Burger;

public class VeganBurger extends Burger {

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Vegan Burger";
	}

	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 25.0f;
	}
}
