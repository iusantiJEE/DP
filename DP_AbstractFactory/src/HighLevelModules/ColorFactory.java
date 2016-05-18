package HighLevelModules;

import LowLevelModules.Blue;
import LowLevelModules.Red;
import LowLevelModules.Yellow;

public class ColorFactory extends AbstractFactory {

	@Override
	public Shape getShape(String shapeType) {
		return null;
	}

	@Override
	public Color getColor(String colorValue) {
		switch (colorValue){
		case "red":
			return new Red();
		case "blue":
			return new Blue();
		case "yellow":
			return new Yellow();
		default:
				return null;
		}
	}

}
