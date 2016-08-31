package implementations;

import abstracts.MyWindow;
import display.Display;

public class WinWindow implements MyWindow {

	@Override
	public void paint() {
		Display.println("painting an Windows window");	
	}

}
