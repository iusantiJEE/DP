package factory;

public class Fabrica {
	
	public Masina creazaMasina(String code){
		Object object =  new Object();
		if ( code == "audi") object =  new Audi();
		if( code == "bmw") object =  new BMW();
		return (Masina) object;
	}
}
