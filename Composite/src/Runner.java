
public class Runner {

	public static void main(String[] args) {
		CopositeElement root = new CopositeElement("Picture");
		root.add(new PrimitiveElement("Red Line"));
		root.add(new PrimitiveElement("Blue Circle"));
		root.add(new PrimitiveElement("Green Box"));

		CopositeElement comp = new CopositeElement("Two Circles");
		comp.add(new PrimitiveElement("Black Circle"));
		comp.add(new PrimitiveElement("White Circle"));
		
		root.add(comp);
		
		root.display(1);
	}

}
