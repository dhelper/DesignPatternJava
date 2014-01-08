
public abstract class Approver {
	private Approver _successor;
	
	public abstract void ProcessRequest(Purchase purchase);
	
	public Approver get_successor() {
		return _successor;
	}

	public void set_successor(Approver _successor) {
		this._successor = _successor;
	}	
}
