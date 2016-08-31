import abstracts.FactoryManufacturer;
import abstracts.WidgetFactory;

/*
 * for more information see DP_AbstractFactory2ß
 */
public class DP_AF2 {
	public static void main(String[] data){
		FactoryManufacturer factory = new FactoryManufacturer();
		
		WidgetFactory osxFactory = factory.getWidgetFactory(FactoryManufacturer.FactoryType.OSX_FACTORY);
		osxFactory.createScrollBar().paint();
		osxFactory.createWindow().paint();
		
		WidgetFactory winFactory = factory.getWidgetFactory(FactoryManufacturer.FactoryType.WIN_FACTORY);
		winFactory.createScrollBar().paint();
		winFactory.createWindow().paint();
	}
}
