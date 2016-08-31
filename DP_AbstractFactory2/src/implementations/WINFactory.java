package implementations;


import abstracts.MyScrollBar;
import abstracts.MyWindow;
import abstracts.WidgetFactory;

public class WINFactory extends WidgetFactory {

	@Override
	public MyScrollBar createScrollBar() {
		return new WinScrollBar();
	}

	@Override
	public MyWindow createWindow() {	
		return new WinWindow();
	}

}
