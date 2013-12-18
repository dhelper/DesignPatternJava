
public class Runner {	

	public static void main(String[] args) {
		Beverage beverage1 = new Espresso();
		print(beverage1);
		
		Beverage beverage2 = new HouseBlend();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		print(beverage2);
		
		Beverage beverage3 = new DarkRoast();
		beverage3 = new Mocha(beverage3);
		beverage3 = new SteamedMilk(beverage3);
		beverage3 = new Whip(beverage3);
		print(beverage3);
	}
	
	public static void print(Beverage beverage){
		System.out.println(beverage.get_Description() + " $" + beverage.cost());
	}
}
