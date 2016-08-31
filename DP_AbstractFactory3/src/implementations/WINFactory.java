package implementations;

import abstracts.GUIFactory;
import abstracts.MyScrollbar;
import abstracts.MyWindow;

public class WINFactory implements GUIFactory {

	@Override
	public MyScrollbar createMyScrollBar() {
		return new WinScrollbar();
	}

	@Override
	public MyWindow createMyWindow() {
		return new WinWindow();
	}

}
