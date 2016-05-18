package LowLevelModules;

import HighLevelModules.Shape;
import HighLevelModules.Utils;

public class Rectangle implements Shape {

	@Override
	public void draw() {
		Utils.display("Drawing a rectangle");
	}
}
