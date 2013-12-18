
public class Shop {
	private VehicleBuilder _vehicleBuilder;
	
	public void construct(VehicleBuilder vehicleBuilder){
		_vehicleBuilder = vehicleBuilder;
		
		_vehicleBuilder.BuildFrame();
		_vehicleBuilder.BuildEngine();
		_vehicleBuilder.BuildWheels();
		_vehicleBuilder.BuildDoors();
	}
	
	public void showVehicle(){
		_vehicleBuilder.get_vehicle().Show();
	}
}
