import abstracts.FactoryProducer;
import abstracts.GUIFactory;

public class DP_AF3 {
	public static void main(String[] data){
		FactoryProducer factory =  new FactoryProducer();
		
		GUIFactory guiFactory = factory.getGUIFactory(FactoryProducer.FactoryType.OSX_FACTORY);
		guiFactory.createMyScrollBar().paint();
		guiFactory.createMyWindow().paint();
		
		guiFactory = factory.getGUIFactory(FactoryProducer.FactoryType.WIN_FACTORY);
		guiFactory.createMyScrollBar().paint();
		guiFactory.createMyWindow().paint();
	}
}
