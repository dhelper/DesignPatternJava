public class AmericaFactory implements IContinentFactory {

	@Override
	public IHerbivore CreateHerbivore() {
		return new Bison();
	}

	@Override
	public ICarnivore CreateCarnivore() {
		return new Wolf();
	}

}

