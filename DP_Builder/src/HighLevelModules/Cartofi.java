package HighLevelModules;

import LowLevelModules.Solid;
import LowLevelModules.Wrapper;

public abstract class Cartofi implements Item{

	@Override
	public abstract String getName();

	@Override
	public abstract float price();

	@Override
	public Packing packing() {
		return new Wrapper();
	}

	@Override
	public State state() {
		return new Solid();
	}

}
