package dp;

import java.util.Map;

import HighLevelModule.Shape;
import HighLevelModule.ShapeCache;
import display.Display;

public class Main {
	public static void main(String[] data){
		ShapeCache.loadShape();
		for(Map.Entry<String, Shape> entry : ShapeCache.shapeMap.entrySet()){
			Display.println(ShapeCache.getShape(entry.getKey()).getType());
		}
//		for(Map.Entry<String, String> entry : System.getenv().entrySet()){
//			System.out.println( entry.getKey() + "\t" +  entry.getValue());
//		}
		
//		for(Map.Entry<Object, Object> entry : System.getProperties().entrySet()){
//			System.out.println(entry.getKey() + "\t\t" + entry.getValue());
//		}
	}
}
