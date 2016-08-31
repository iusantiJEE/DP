package implementations;

import abstracts.MyScrollbar;
import display.Display;

public class WinScrollbar implements MyScrollbar{

	@Override
	public void paint() {
		Display.println("painting a Windows scrollbar");
	}

}
