
public class Whip extends CondimentDecorator {
	Beverage _beverage;
	
	public Whip(Beverage beverage) {
		_beverage = beverage;
	}

	@Override
	public String get_Description() {
		return _beverage.get_Description() + ", Whip";
	}

	@Override
	public double cost() {
		return 0.15 + _beverage.cost();
	}
}
