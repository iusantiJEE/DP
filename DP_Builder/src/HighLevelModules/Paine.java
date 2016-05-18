package HighLevelModules;

import LowLevelModules.Solid;
import LowLevelModules.Wrapper;

public abstract class Paine implements Item{

	@Override
	public abstract String getName();

	@Override
	public abstract float price();

	@Override
	public Packing packing() {
		// TODO Auto-generated method stub
		return new Wrapper();
	}

	@Override
	public State state() {
		// TODO Auto-generated method stub
		return new Solid();
	}

}
