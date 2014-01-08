
public class CEO extends Approver {

	@Override
	public void ProcessRequest(Purchase purchase) {
		if(purchase.get_amount() < 100000) {
			System.out.println("CEO approved request #" + purchase.get_number());
		} 
		else if(get_successor() != null){
			get_successor().ProcessRequest(purchase);
		}
		else{
			System.out.println("Request #" + purchase.get_number() + " requires an executive meeting!");
		}
	}
}
