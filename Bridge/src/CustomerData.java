import java.util.ArrayList;
import java.util.List;


public class CustomerData implements IDataObject<String> {
	private String _city;
	private List<String> _customers;
	private int _current;
	
	public CustomerData(String city){
		_city = city;
		
		_customers = new ArrayList<String>();
		_customers.add("Jim Jones");
		_customers.add("Samual Jackson");
		_customers.add("Allan Good");
		_customers.add("Ann Stills");
		_customers.add("Lisa Giolani");
	}
	
	@Override
	public void nextRecord() {
		if(_current <= _customers.size()){
			_current++;
		}

	}

	@Override
	public void priorRecord() {
		if(_current > 0){
			_current--;
		}
	}

	@Override
	public void addRecord(String name) {
		_customers.add(name);
	}

	@Override
	public void deleteRecord(String name) {
		_customers.remove(name);
	}

	@Override
	public String getCorrectRecord() {
		return _customers.get(_current);
	}

	@Override
	public void showRecord() {
		System.out.println(_customers.get(_current));
	}

	@Override
	public void showAllRecords() {
		for(String name : _customers){
			System.out.println(name);
		}

	}

	public String get_city() {
		return _city;
	}

	public void set_city(String _city) {
		this._city = _city;
	}

}
