package LowLevelModule;

import HighLevelModule.Shape;
import display.Display;

public class Circle extends Shape{

	public Circle() {
		super._type = "Circle";
	}
	
	@Override
	public void draw() {
		Display.println("Inside Circle object: draw() method");
	}

}
