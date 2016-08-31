package implementations;
import abstracts.MyScrollbar;
import display.Display;
public class OSXScrollbar implements MyScrollbar{

	@Override
	public void paint() {
		Display.println("painting an OSX scrollbar");
		
	}

}
