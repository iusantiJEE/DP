import dp.Singleton;
import package1.InsertData;
import package2.TakeData;

public class Main {

	public static void main(String[] data){
		Singleton singleton =  Singleton.create();
		
		new InsertData(singleton).generate();
		new TakeData(singleton).reciveValues().printValues();;
	
	}
}
