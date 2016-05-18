package HighLevelModules;

public interface Item {
	//delegated to VeganBurger, ChickenBurger,..OtherBurger via [abstract Burger]
	//delegated to Pepsi, CocaCola,..OtherDrink via [abstract ColdDrink]
	public String getName();
	
	//delegated to VeganBurger, ChickenBurger,..OtherBurger via [abstract Burger]
	//delegated to Pepsi, CocaCola,..OtherDrink via [abstract ColdDrink]
	float price();
	
	//see implentations of Packing inteface
	public Packing packing();
	
	//see implentations of State inteface
	public State state();
}
