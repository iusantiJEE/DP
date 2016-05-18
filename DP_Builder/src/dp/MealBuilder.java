package dp;

import LowLevelModules.CheeseBurger;
import LowLevelModules.ChikenBurger;
import LowLevelModules.CocaCola;
import LowLevelModules.Pepsi;
import LowLevelModules.VeganBurger;

public class MealBuilder {
	public Meal prepareMeatMeal(){
		Meal meal = new Meal();
		meal.addItem(new Pepsi());
		meal.addItem(new ChikenBurger());
		meal.addItem(new ChikenBurger());
		meal.addItem(new CheeseBurger());
		return meal;
	}
	
	public Meal prepareVeganMeal(){
		Meal meal = new Meal();
		meal.addItem(new CocaCola());
		meal.addItem(new VeganBurger());
		meal.addItem(new VeganBurger());
		return meal;
	}
}
