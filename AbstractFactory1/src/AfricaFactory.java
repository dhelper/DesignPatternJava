
public class AfricaFactory extends ContinentFactory {

	@Override
	public Herbivore CreateHerbivore() {
		return new Wildebeest();
	}

	@Override
	public Carnivore CreateCarnivore() {
		return new Lion();
	}
}

