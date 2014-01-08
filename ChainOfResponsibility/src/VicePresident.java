
public class VicePresident extends Approver {

	@Override
	public void ProcessRequest(Purchase purchase) {
		if(purchase.get_amount() < 25000) {
			System.out.println("Vice president approved request #" + purchase.get_number());
		} 
		else if(get_successor() != null){
			get_successor().ProcessRequest(purchase);
		}
	}
}
