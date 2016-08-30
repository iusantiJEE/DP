package abstracts;

import implementations.MotifFactory;
import implementations.PmFactory;

public  class FactoryManufacturer {
	private enum FactoryType{
		Pm_FACTORY, Motif_FACTORY;
		
	}
	
	public WidgetFactory getWidgetFactory(FactoryType factoryType){
		switch(factoryType){
		case Pm_FACTORY:
			return new PmFactory();
		case Motif_FACTORY:
			return new MotifFactory();
		default:
			return null;
		}
	}
}
