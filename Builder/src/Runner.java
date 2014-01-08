
public class Runner {

	public static void main(String[] args) {
		Shop shop = new Shop();
		
		shop.construct(new MotorCycleBuilder());
		shop.showVehicle();
		
StringBuilder sb = new StringBuilder();
sb.append(" Welcome to the world of design patterns. ");
sb.insert(6, "Some word");
sb.replace(12, 15, "str");

String result = sb.toString();
	}
}
