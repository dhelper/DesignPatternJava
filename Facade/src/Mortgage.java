
public class Mortgage {
	private Bank _bank = new Bank();
	private Loan _loan = new Loan();
	private Credit _credit = new Credit();
	
	public boolean isEligible(Customer customer, int amount){
		System.out.println(customer.get_name()+ " applies for " + amount);
		
		boolean isEligible = _bank.hasSufficientSavings(customer, amount) &&
				_loan.hasNoBadLoans(customer) &&
				_credit.hasGoodCredit(customer);
		
		return isEligible;
	}
}
