import java.util.ArrayList;
import java.util.List;


public class Runner {

	public static void main(String[] args) {
		List<IEmployee> list  = new ArrayList<IEmployee>();
		list.add(new Employee("John"));
		list.add(new Employee("Anderson"));
		list.add(new ConsultantToEmployeeAdapter("Philip"));
		
		for(IEmployee employee : list){
			employee.showHappiness();
		}		
	}
}
