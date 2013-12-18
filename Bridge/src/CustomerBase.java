/*
 * The abstraction class
 */
public class CustomerBase {
	private IDataObject<String> _dataobject;

	public IDataObject<String> get_dataobject() {
		return _dataobject;
	}

	public void set_dataobject(IDataObject<String> _dataobject) {
		this._dataobject = _dataobject;
	}
	
	public void next(){
		_dataobject.nextRecord();
	}
	
	public void prior(){
		_dataobject.priorRecord();
	}
	
	public void add(String name){
		_dataobject.addRecord(name);
	}
	
	public void delete(String name){
		_dataobject.deleteRecord(name);
	}
	
	public void show(){
		_dataobject.showRecord();
	}
	
	public void showAll(){
		_dataobject.showAllRecords();
	}
}
