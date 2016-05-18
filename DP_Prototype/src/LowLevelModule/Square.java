package LowLevelModule;

import HighLevelModule.Shape;
import display.Display;

public class Square  extends Shape{

	public Square(){
		super._type = "Square";
	}
	@Override
	public void draw() {
		Display.println("Inside Square object: draw() method");
	}

}
