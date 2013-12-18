
public class Runner {

	public static void main(String[] args) {
		Shop shop = new Shop();
		
		shop.construct(new MotorCycleBuilder());
		shop.showVehicle();
	}
}
