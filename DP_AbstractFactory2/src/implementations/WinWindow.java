package implementations;

import abstracts.MyWindow;
import display.Display;

public class WinWindow extends MyWindow{

	@Override
	public void paint() {
		Display.println("painting a Windows Window");
	}

}
