
public class Employee implements IEmployee {
    private String name;
 
    public Employee(String name)    {
        this.name = name;
    }
 
    @Override
	public void showHappiness(){
        System.out.print("Employee ");
        System.out.print(this.name);
        System.out.print(" is happy");
        System.out.println();
    }
}
