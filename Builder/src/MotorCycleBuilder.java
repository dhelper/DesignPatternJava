
public class MotorCycleBuilder extends VehicleBuilder {

	protected MotorCycleBuilder() {
		super(VehicleType.MotorCycle);

	}

	@Override
	public void BuildFrame() {
		get_vehicle().set_Part(PartType.Frame, "MotorCycle frame");

	}

	@Override
	public void BuildEngine() {
		get_vehicle().set_Part(PartType.Engine, "500 cc");

	}

	@Override
	public void BuildWheels() {
		get_vehicle().set_Part(PartType.Wheel, "2");
	}

	@Override
	public void BuildDoors() {
		get_vehicle().set_Part(PartType.Door, "0");
	}

}
