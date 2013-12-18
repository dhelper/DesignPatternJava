
public class Consultant {
    private String name;
 
    public Consultant(String name)
    {
        this.name = name;
    }
 
    protected void ShowSmile()
    {
    	System.out.print("Consultant ");
    	System.out.print(this.name);
    	System.out.print(" smiles");
    	System.out.println();
    }
}
