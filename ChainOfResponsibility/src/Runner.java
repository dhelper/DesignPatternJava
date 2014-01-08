
public class Runner {

	public static void main(String[] args) {
		Approver larry = new Director();
		Approver sam = new VicePresident();
		Approver tammy = new CEO();

		larry.set_successor(sam);
		sam.set_successor(tammy);
		
		Purchase purchase1 = new Purchase(2034, 350.0, "Supplies");
		larry.ProcessRequest(purchase1);
		
		Purchase purchase2 = new Purchase(2035, 32590.1, "Project X");
		larry.ProcessRequest(purchase2);
		
		Purchase purchase3 = new Purchase(2036, 122100, "Project Y");
		larry.ProcessRequest(purchase3);
	}

}
