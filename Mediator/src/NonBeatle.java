
public class NonBeatle extends Participant {
	public NonBeatle(String name) {
		super(name);
	}

	@Override
	public void Recieve(String from, String message){
		System.out.print("To a non-Beatle: ");
		super.Recieve(from, message);
	}
}
