
public class Purchase {
	private double _amount;
	private String _purpose;
	private int _number;
	
	public Purchase(int _number, double _amount, String _purpose) {
		super();
		this._amount = _amount;
		this._purpose = _purpose;
		this._number = _number;
	}
	public double get_amount() {
		return _amount;
	}
	
	public String get_purpose() {
		return _purpose;
	}
	
	public int get_number() {
		return _number;
	}
	
}
