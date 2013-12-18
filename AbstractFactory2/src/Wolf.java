
public class Wolf implements ICarnivore {

	@Override
	public void Eat(IHerbivore herbivore) {
		System.out.print(this);
		System.out.print(" eats ");
		System.out.print(herbivore);	
	}

}

