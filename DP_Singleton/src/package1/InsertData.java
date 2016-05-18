package package1;

import java.util.ArrayList;

import dp.Singleton;

public class InsertData {
	Singleton _singleton;
	public InsertData(Singleton singleton){
		_singleton =  singleton;
	}
	public void  generate(){
		ArrayList<Integer> data =  new ArrayList<Integer>();
		for (int i = 0 ; i < 20; i++){
			data.add (i*20/5);
		}
		_singleton.putValues(data);
	}
}
