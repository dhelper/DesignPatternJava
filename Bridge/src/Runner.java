
public class Runner {

	public static void main(String[] args) {
		
		
		Customers customers = new Customers();
		
		customers.set_dataobject(new CustomerData("Chicago"));
		
		customers.show();
		customers.next();
		customers.show();
		customers.next();
		customers.show();
		
		customers.add("Henry Velasquez");
		customers.showAll();
	}

}
