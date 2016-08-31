package implementations;

import abstracts.GUIFactory;
import abstracts.MyScrollbar;
import abstracts.MyWindow;

public class OSXFactory implements GUIFactory {

	@Override
	public MyScrollbar createMyScrollBar() {
		return new OSXScrollbar();
	}

	@Override
	public MyWindow createMyWindow() {
		return new OSXWindow();
	}

}
