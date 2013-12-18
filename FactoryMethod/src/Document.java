import java.util.ArrayList;


public abstract class Document {
	private ArrayList<Page> _pages; 
	
	// Constructor invoke Factory Method
	public Document(){
		this.CreatePages();
	}

	public ArrayList<Page> get_pages() {
		return _pages;
	}	
	
	public void set_pages(ArrayList<Page> pages) {
		_pages = pages;
	}	
	
	// Factory Method
	public abstract void CreatePages();
}

