package LowLevelModules;

import HighLevelModules.Color;
import HighLevelModules.Utils;

public class Blue implements Color {

	@Override
	public void fill() {
		Utils.display("Filling with Blue");
	}

}
