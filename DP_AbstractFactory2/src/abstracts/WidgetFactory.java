package abstracts;



import implementations.MyScrollBar;
import implementations.MyWindow;

public  abstract class  WidgetFactory {
	public abstract MyScrollBar createScrollBar();
	public abstract MyWindow createWindow();
}
