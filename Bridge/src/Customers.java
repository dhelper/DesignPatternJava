/*
 * Refined abstraction
 */
public class Customers extends CustomerBase{
	@Override
	public void showAll(){
		System.out.println();
		System.out.println("------------");
		super.showAll();
		System.out.println("------------");
	}
}
