package LowLevelModule;

import HighLevelModule.Shape;
import display.Display;

public class Rectangle extends Shape{

	public Rectangle(){
		super._type = "Rectangle";
	}
	@Override
	public void draw() {
		Display.println("Inside Rectangle object: draw() method");
	}


}
