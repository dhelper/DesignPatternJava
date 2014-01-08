
public class Beatle extends Participant {
	public Beatle(String name) {
		super(name);
	}

	@Override
	public void Recieve(String from, String message){
		System.out.print("To a Beatle: ");
		super.Recieve(from, message);
	}
}
