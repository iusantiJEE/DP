package dp;

import java.util.ArrayList;
import java.util.List;

import HighLevelModules.Item;
import display.Display;
import strings.DelimitedStringBuilder;

public class Meal {
	private List<Item> _items =  new ArrayList<Item>();
	private DelimitedStringBuilder _dsb =  new DelimitedStringBuilder("  ");
	private float _cost;
	
	public void addItem(Item item){
		_items.add(item);
	}
	
	public float getCost(){
		_items.forEach(item->{
			_cost += item.price();
		});
		return _cost;
	}
	
	public Meal showItems(){
		_dsb.reset();
		_dsb.append("");
		for(Item item : _items){
			_dsb.append("Item: " + item.getName());
			_dsb.append("Packing: " + item.packing().pack());
			_dsb.append("Price: " + item.price());
			_dsb.append("State:" + item.state().aggregqtionState());
			_dsb.append("\n");
		}
		
		Display.println(_dsb.toString());
		
		_dsb.reset();
		Display.println("TOTAL: " + getCost() + " RON");
		return this;
	}
}
