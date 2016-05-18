package LowLevelModules;

import HighLevelModules.Color;
import HighLevelModules.Utils;

public class Yellow implements Color {
	@Override
	public void fill() {
		Utils.display("Filling with Yellow");
	}
}
