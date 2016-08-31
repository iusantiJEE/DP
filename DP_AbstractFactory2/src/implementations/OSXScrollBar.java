package implementations;

import abstracts.MyScrollBar;
import display.Display;

public class OSXScrollBar extends MyScrollBar {

	@Override
	public void paint() {
		Display.println("painting an OSXScrollbar");
		
	}

}
