package package2;

import dp.Singleton;

public class TakeData {
	Singleton _singleton;
	public TakeData(Singleton singleton) {
		_singleton =  singleton;
	}

	public TakeData reciveValues(){
		_singleton.getValues();
		return this;
	}
	
	public void printValues(){
		StringBuilder sb = new StringBuilder();
		for ( Object obj : _singleton.getValues()){
			sb.append(obj+"\t");
		}
		System.out.println(sb.toString());
	}
}
