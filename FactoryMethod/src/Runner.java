import java.util.ArrayList;

public class Runner {
	public static void main(String[] args) {
		ArrayList<Document> documents = new ArrayList<Document>();
		documents.add(new Resume());
		documents.add(new Report());

		for(Document document : documents){
			System.out.println(document);
			System.out.println("---------");
			for(Page page : document.get_pages()){
				System.out.println(page);
			}
			
			System.out.println();
		}
	}
}

