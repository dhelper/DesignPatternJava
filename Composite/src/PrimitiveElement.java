/*
 * The leaf class
 */
public class PrimitiveElement extends DrawingElement {

	
	public PrimitiveElement(String name) {
		super(name);

	}

	@Override
	public void add(DrawingElement d) {
		System.out.println("Cannot add to a primitive");
	}

	@Override
	public void remove(DrawingElement d) {
		System.out.println("Cannot remove from a primitive");
	}

	@Override
	public void display(int indent) {
		for(int i = 0; i < indent; i++){
			System.out.print("-");	
		}
		
		System.out.println(" " + get_name());	
	}

}
