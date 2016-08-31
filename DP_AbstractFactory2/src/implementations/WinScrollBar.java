package implementations;

import abstracts.MyScrollBar;
import display.Display;

public class WinScrollBar extends MyScrollBar{

	@Override
	public void paint() {
		Display.println("painting a Windows Scrollbar");
		
	}

}
