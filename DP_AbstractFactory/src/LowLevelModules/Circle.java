package LowLevelModules;

import HighLevelModules.Shape;
import HighLevelModules.Utils;

public class Circle implements Shape {
	@Override
	public void draw() {
		Utils.display("Drawing a circle");
	}
}
