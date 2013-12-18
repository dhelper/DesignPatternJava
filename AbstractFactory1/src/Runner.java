public class Runner {
	public static void main(String[] args) {		
		ContinentFactory africa = new AfricaFactory();
		AnimalWorld world = new AnimalWorld(africa);
		world.RunFoodChain();
		
		System.out.println();
		
		ContinentFactory america = new AmericaFactory();
		world = new AnimalWorld(america);
		world.RunFoodChain();
	}
}

