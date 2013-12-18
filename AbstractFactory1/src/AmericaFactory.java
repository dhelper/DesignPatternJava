
public class AmericaFactory extends ContinentFactory{

	@Override
	public Herbivore CreateHerbivore() {
		return new Bison();
	}

	@Override
	public Carnivore CreateCarnivore() {
		return new Wolf();
	}

}
