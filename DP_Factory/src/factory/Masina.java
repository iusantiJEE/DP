package factory;

public abstract class Masina {
	private  int _km;
	
	public static void info(Object object){
		System.out.println(object);
	}
	public void setMaxKm(int km){
		_km = km;
	}
	
}
