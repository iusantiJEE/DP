package dp;

public class Main {
	public static void main(String[] data){
		new MealBuilder().prepareMeatMeal().showItems();
		new MealBuilder().prepareVeganMeal().showItems();
	}
}
