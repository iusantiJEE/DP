package LowLevelModules;

import HighLevelModules.Item;
import HighLevelModules.Packing;

public abstract class ColdDrink implements Item {
	//delegates the method to the next object in the inheritance chain
	@Override
	public abstract String getName();

	@Override
	public Packing packing() {
		// TODO Auto-generated method stub
		return new Bottle();
	}

	//delegates the method to the next object in the inheritance chain
	@Override
	public abstract float price();

}
