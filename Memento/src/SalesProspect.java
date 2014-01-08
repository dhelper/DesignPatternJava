
public class SalesProspect {
	private String _name;
	private String _phone;
	private double _budget;
	
	public String get_name() {
		return _name;
	}
	public void set_name(String _name) {
		this._name = _name;
		System.out.println("Name: " + _name);
	}
	public String get_phone() {
		return _phone;
	}
	public void set_phone(String _phone) {
		this._phone = _phone;
		System.out.println("Phone: " + _phone);
	}
	public double get_budget() {
		return _budget;
	}
	public void set_budget(double _budget) {
		this._budget = _budget;
		System.out.println("Budget: " + _budget);
	}
	
	public Memento SaveMemento(){
		System.out.println();
		System.out.println("-- Saving state --");
		return new Memento(_name, _phone, _budget);
	}
	
	public void RestoreMemento(Memento memento){
		System.out.println();
		System.out.println("-- Restoring state --");
		this.set_name(memento.get_name());
		this.set_phone(memento.get_Phone());
		this.set_budget(memento.get_budget());
	}
}
