package HighLevelModules;

import LowLevelModules.Circle;
import LowLevelModules.Rectangle;
import LowLevelModules.Square;

public class ShapeFactory extends AbstractFactory {

	@Override
	public Shape getShape(String shapeType) {
		switch(shapeType){
		case "circle":
			return new Circle();
		case "rectangle":
			return new Rectangle();
		case "square":
			return new Square();
		default:
			return null;
		}
	}

	@Override
	public Color getColor(String colorValue) {
		return null;
	}


}
