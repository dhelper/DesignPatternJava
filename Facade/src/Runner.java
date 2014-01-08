
public class Runner {

	public static void main(String[] args) {
		Mortgage mortgage = new Mortgage();
		
		Customer customer = new Customer("joe");
		
		boolean isEligible = mortgage.isEligible(customer, 12500);
		
		System.out.println(customer.get_name() + " has been " + (isEligible ? "Approved" :  "Rejected"));
	}

}
