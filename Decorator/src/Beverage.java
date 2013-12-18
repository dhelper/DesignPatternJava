
public abstract class Beverage {
	String _description = "Unknown Beverage";
	
	public String get_Description(){
		return _description;
	}
	
	public abstract double cost();
}
