import HighLevelModules.AbstractFactory;
import HighLevelModules.Color;
import HighLevelModules.FactoryProducer;
import HighLevelModules.Shape;

public class Main {
	public static void main(String data[]){
		FactoryProducer factoryProducer =  new FactoryProducer();
		AbstractFactory colorFactory = factoryProducer.getFactory("colorFactory");
		AbstractFactory shapeFactory =  factoryProducer.getFactory("shapeFactory");
		
		Shape square =  shapeFactory.getShape("square");
		square.draw();
		
		Color red = colorFactory.getColor("red");
		red.fill();
		
		Shape circle = shapeFactory.getShape("circle");
		circle.draw();
		
		Color blue  =  colorFactory.getColor("blue");
		blue.fill();
		
		
		Shape rectangle =  shapeFactory.getShape("rectangle");
		rectangle.draw();
		
		Color yellow =  colorFactory.getColor("yellow");
		yellow.fill();
		
	}
}
