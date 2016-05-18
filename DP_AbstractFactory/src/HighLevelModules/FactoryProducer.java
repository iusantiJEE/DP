package HighLevelModules;

public class FactoryProducer {
	
	public AbstractFactory getFactory(String factoryType){
		switch(factoryType){
		case "colorFactory":
			return new ColorFactory();
		case "shapeFactory":
			return new ShapeFactory();
		default:
			return null;
		}
		
	}
}
