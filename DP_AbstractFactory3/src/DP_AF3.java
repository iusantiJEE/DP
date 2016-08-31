import abstracts.FactoryProducer;
import abstracts.GUIFactory;
import abstracts.MyScrollbar;
import abstracts.MyWindow;

public class DP_AF3 {
	public static void main(String[] data){
//		FactoryProducer factory =  new FactoryProducer();
//		
//		GUIFactory guiFactory = factory.getGUIFactory(FactoryProducer.FactoryType.OSX_FACTORY);
//		guiFactory.createMyScrollBar().paint();
//		guiFactory.createMyWindow().paint();
//		
//		guiFactory = factory.getGUIFactory(FactoryProducer.FactoryType.WIN_FACTORY);
//		guiFactory.createMyScrollBar().paint();
//		guiFactory.createMyWindow().paint();
		
//		OR
		
		FactoryProducer factoryProducer =  new FactoryProducer();
		GUIFactory guiFactory =  null;
		
		guiFactory =  factoryProducer.getGUIFactory(FactoryProducer.FactoryType.OSX_FACTORY);
		
		MyScrollbar scrollbar = guiFactory.createMyScrollBar();
		scrollbar.paint();
		
		MyWindow window = guiFactory.createMyWindow();
		window.paint();
		
		//---
		guiFactory = factoryProducer.getGUIFactory(FactoryProducer.FactoryType.WIN_FACTORY);
		
		scrollbar = guiFactory.createMyScrollBar();
		scrollbar.paint();
		
		window = guiFactory.createMyWindow();
		window.paint();
		
	}
}
