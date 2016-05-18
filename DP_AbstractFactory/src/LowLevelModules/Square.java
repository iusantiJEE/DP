package LowLevelModules;

import HighLevelModules.Shape;
import HighLevelModules.Utils;

public class Square implements Shape {
	@Override
	public void draw() {
		Utils.display("Drawing a square");
	}
}
