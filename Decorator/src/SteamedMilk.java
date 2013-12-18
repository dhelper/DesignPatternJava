
public class SteamedMilk extends CondimentDecorator {
	Beverage _beverage;
	
	public SteamedMilk(Beverage beverage) {
		_beverage = beverage;
	}

	@Override
	public String get_Description() {
		return _beverage.get_Description() + ", Steamed Milk";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 0.10 + _beverage.cost();
	}

}
