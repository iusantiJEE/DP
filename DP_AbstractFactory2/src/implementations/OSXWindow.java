package implementations;

import abstracts.MyWindow;
import display.Display;

public class OSXWindow extends MyWindow{

	@Override
	public void paint() {
		Display.println("painting an OSX Window");
	}

}
