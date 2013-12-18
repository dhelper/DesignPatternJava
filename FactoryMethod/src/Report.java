import java.util.ArrayList;

public class Report extends Document {

	@Override
	public void CreatePages() {
		ArrayList<Page> pages = new ArrayList<Page>();

		pages.add(new IntroductionPage());
		pages.add(new ResultPage());
		pages.add(new ConclusionPage());
		pages.add(new SummeryPage());
		pages.add(new BibliographyPage());

		set_pages(pages);

	}

}
