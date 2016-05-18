import factory.Fabrica;
import factory.Masina;

public class Main {
	
	public static void main(String[] args){
		Fabrica fabrica = new Fabrica();
		Masina audi = fabrica.creazaMasina("audi");
		Masina bmw = fabrica.creazaMasina("bmw");
		
		audi.setMaxKm(200);
		bmw.setMaxKm(150);
	}
}
