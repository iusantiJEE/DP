package LowLevelModules;
import HighLevelModules.Color;
import HighLevelModules.Utils;

public class Red implements Color {

	@Override
	public void fill() {
		Utils.display("Filling with red");
	}
	
}
