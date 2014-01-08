
public class Memento {
	private String _name;
	private String _phone;
	private double _budget;	
	
	public Memento(String _name, String _phone, double _budget) {
		super();
		this._name = _name;
		this._phone = _phone;
		this._budget = _budget;
	}
	public String get_name() {
		return _name;
	}
	
	public String get_Phone() {
		return _phone;
	}
	
	public double get_budget() {
		return _budget;
	}
	
}
