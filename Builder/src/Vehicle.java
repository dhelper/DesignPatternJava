import java.util.HashMap;
import java.util.Map;

public class Vehicle {
	private VehicleType _vehicleType;
	private Map<PartType, String> _parts = new HashMap<PartType, String>();;
	
	public Vehicle(VehicleType vehicleType){		 
		_vehicleType = vehicleType;
	}
	
	public void set_Part(PartType partType, String partData){
		_parts.put(partType, partData);
	}
	
	public void Show(){
		System.out.println(_vehicleType);
		System.out.println("-------------");
		
		for(Map.Entry<PartType, String> part : _parts.entrySet()){
			System.out.println(part.getKey() + " : " + part.getValue());
			
		}
	}
}
