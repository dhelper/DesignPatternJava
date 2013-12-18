import java.awt.Graphics;
import java.awt.List;
import java.util.ArrayList;


public class Group extends Shape {
	private ArrayList<Shape> _shapes= new ArrayList<Shape>();
	
	protected Group(double x, double y) {
		super(x, y);
	}
	
	public void AddShape(Shape newShape){
		_shapes.add(newShape);
	}
	
	@Override
	public void Move(double dx, double dy){
		for(Shape shape : _shapes){
			shape.Move(dx, dy);
		}
	}

	@Override
	public void Draw(Graphics g) {
		for(Shape shape : _shapes){
			shape.Draw(g);
		}
	}
}

