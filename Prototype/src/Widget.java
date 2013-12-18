
public abstract class Widget {
	private int _height;
	private int _width;
	private String _id;
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}

	public int get_height() {
		return _height;
	}

	public void set_height(int _height) {
		this._height = _height;
	}

	public int get_width() {
		return _width;
	}

	public void set_width(int _width) {
		this._width = _width;
	}

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}
}
