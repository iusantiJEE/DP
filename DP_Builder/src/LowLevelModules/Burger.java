package LowLevelModules;

import HighLevelModules.Item;
import HighLevelModules.Packing;

public abstract class Burger implements Item{
	
	//delegates the method to the next object in the inheritance chain
	@Override
	public  abstract String getName();

	@Override
	public Packing packing() {
		return new Wrapper();
	}

	@Override
	public abstract float price();

}
