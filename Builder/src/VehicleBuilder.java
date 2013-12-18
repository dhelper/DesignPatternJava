
public abstract class VehicleBuilder {
	private Vehicle _vehicle;
	protected VehicleBuilder(VehicleType vehicleType){
		_vehicle = new Vehicle(vehicleType);
	}	
	
	public Vehicle get_vehicle() {
		return _vehicle;
	}	
	
	public abstract void BuildFrame();
	public abstract void BuildEngine();
	public abstract void BuildWheels();
	public abstract void BuildDoors();
}
