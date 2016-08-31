package abstracts;

import implementations.OSXFactory;
import implementations.WINFactory;

public  class FactoryManufacturer {
	public static enum FactoryType{
		WIN_FACTORY, OSX_FACTORY;
		
	}
	
	public WidgetFactory getWidgetFactory(FactoryType factoryType){
		switch(factoryType){
		case WIN_FACTORY:
			return new WINFactory();
		case OSX_FACTORY:
			return new OSXFactory();
		default:
			return null;
		}
	}
}
