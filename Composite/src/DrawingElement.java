/*
 * The component class
 */
public abstract class DrawingElement {
	private String _name;

	public DrawingElement(String name){
		_name = name;
	}

	public String get_name() {
		return _name;
	}

	public abstract void add(DrawingElement d);
	public abstract void remove(DrawingElement d);
	public abstract void display(int indent);
}
