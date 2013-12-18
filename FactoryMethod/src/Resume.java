import java.util.ArrayList;


public class Resume extends Document {

	@Override
	public void CreatePages() {
		ArrayList<Page> pages = new ArrayList<Page>();
		
		pages.add(new SkillsPage());
		pages.add(new EducationPage());
		pages.add(new ExperiencePage());
		
		set_pages(pages);
	}
}

