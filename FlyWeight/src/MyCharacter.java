
public class MyCharacter {
	protected char _symbol;
	protected int _width;
	protected int _height;
	protected int _ascent;
	protected int _descent;
	
	public void display(int pointSize){
		System.out.println(_symbol + " (pointsize " + pointSize + ")"); 
	}
}
