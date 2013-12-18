
public class ConsultantToEmployeeAdapter extends Consultant implements IEmployee {

	public ConsultantToEmployeeAdapter(String name) {
		super(name);
	}

	@Override
	public void showHappiness() {
		super.ShowSmile();
	}
}
