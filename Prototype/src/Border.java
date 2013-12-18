
public class Border extends Widget {
	private Widget _content;
	
	public Border(Widget content){
		set_content(content);
	}
	
	public Widget get_content() {
		return _content;
	}

	public void set_content(Widget _content) {
		this._content = _content;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		Border cloned = (Border)super.clone();
		
		cloned.set_content((Widget)_content.clone());
		
		return cloned;
	}	
}
