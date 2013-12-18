import java.awt.Graphics;

public abstract class Shape {
	private double _x, _y;

	protected Shape(double x, double y) {
		_x = x;
		_y = y;
	}
	
	public void Move(double dx, double dy){
		_x += dx;
		_y += dy;
	}
	
	public abstract void Draw(Graphics g);
}

