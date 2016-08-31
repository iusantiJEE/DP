package implementations;


import abstracts.MyScrollBar;
import abstracts.MyWindow;
import abstracts.WidgetFactory;

public class OSXFactory extends WidgetFactory {

	@Override
	public MyScrollBar createScrollBar() {
		return new OSXScrollBar();
	}

	@Override
	public MyWindow createWindow() {
		return new OSXWindow();
	}

}
