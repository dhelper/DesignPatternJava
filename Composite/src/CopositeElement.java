import java.util.ArrayList;
import java.util.List;


public class CopositeElement extends DrawingElement {
	private List<DrawingElement> _elements = new ArrayList<DrawingElement>();
	
	public CopositeElement(String name) {
		super(name);
 
	}

	@Override
	public void add(DrawingElement d) {
		_elements.add(d);
	}

	@Override
	public void remove(DrawingElement d) {
		_elements.remove(d);
	}

	@Override
	public void display(int indent) {
		for(int i = 0 ;i < indent; i++){
			System.out.print("-");	
		}
		
		System.out.println(" " + get_name());	
		
		for(DrawingElement d : _elements){
			d.display(indent + 2);
		}
		
	}

}
