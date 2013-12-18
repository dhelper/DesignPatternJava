
public class Mocha extends CondimentDecorator {
	Beverage _beverage;
	
	public Mocha(Beverage beverage) {
		_beverage = beverage;
	}

	@Override
	public String get_Description() {
		return _beverage.get_Description() + ", Mocha";
	}

	@Override
	public double cost() {
		return 0.20 + _beverage.cost();
	}
}
