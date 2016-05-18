package HighLevelModule;

import java.util.Hashtable;
import java.util.LinkedHashMap;

import LowLevelModule.Circle;
import LowLevelModule.Rectangle;
import LowLevelModule.Square;

public class ShapeCache {
	public static LinkedHashMap<String, Shape> shapeMap = new LinkedHashMap<String, Shape>();

	public static Shape getShape(String shapeId) {
		Shape cachedShape = shapeMap.get(shapeId);
		return (Shape) cachedShape.clone();
	}

	// for each shape run database query and create shape
	// shapeMap.put(shapeKey, shape);
	// for example, we are adding three shapes
	public static void loadShape() {
		Circle circle = new Circle();
		circle.setId("1");
		shapeMap.put(circle.getId(), circle);

		Square square = new Square();
		square.setId("2");
		shapeMap.put(square.getId(), square);

		Rectangle rectangle = new Rectangle();
		rectangle.setId("3");
		shapeMap.put(rectangle.getId(), rectangle);

	}

}
