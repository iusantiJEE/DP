package implementations;

import abstracts.MyWindow;
import display.Display;

public class OSXWindow implements MyWindow{

	@Override
	public void paint() {
		Display.println("painting an OSX Window");
		
	}

}
