package dp;
import java.util.ArrayList;

public class Singleton {
	private ArrayList<? extends Object> _values = new ArrayList<Object>();
	private static Singleton _INSTANCE =  new Singleton();
	
	//the instance can't be accessed outside this class
	private Singleton(){}
	
	public static Singleton create(){
		return _INSTANCE;
	}
	
	//using the singleton as a buffer to transfer values between different classes 
	//on different layers 
	public void putValues(ArrayList<? extends Object> values){
		_values =  values;
	}
	public ArrayList<? extends Object> getValues(){
		return _values;
	}
	
}
