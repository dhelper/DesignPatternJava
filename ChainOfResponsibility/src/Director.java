
public class Director extends Approver {

	@Override
	public void ProcessRequest(Purchase purchase) {
		if(purchase.get_amount() < 10000) {
			System.out.println("Director approved request #" + purchase.get_number());
		} 
		else if(get_successor() != null){
			get_successor().ProcessRequest(purchase);
		}
	}

}
