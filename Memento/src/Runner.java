
public class Runner {

	public static void main(String[] args) {
		SalesProspect s = new SalesProspect();
		s.set_name("Noel van Halen");
		s.set_phone("(412) 256-0990");
		s.set_budget(25000);
		
		ProspectMemory m = new ProspectMemory();
		m.set_memento(s.SaveMemento());
		
		s.set_name("Leo Walch");
		s.set_phone("(301) 203-1112");
		s.set_budget(1000000);
		
		s.RestoreMemento(m.get_memento());
	}

}
