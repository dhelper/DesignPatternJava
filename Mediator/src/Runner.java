
public class Runner {

	public static void main(String[] args) {
		Participant George = new Beatle("George");
		Participant John = new Beatle("John");
		Participant Ringo = new Beatle("Ringo");
		Participant Paul = new Beatle("Paul");
		Participant Yoko = new NonBeatle("Yoko");
		
		Chatroom chatroom = new Chatroom();
		chatroom.Register(George);
		chatroom.Register(John);
		chatroom.Register(Ringo);
		chatroom.Register(Paul);
		chatroom.Register(Yoko);
		
		Yoko.Send("John", "Hi John!");
		Paul.Send("Ringo", "All you need is love");
		Ringo.Send("George", "My sweet lord");
		Paul.Send("John", "Can't buy me love");
		John.Send("Yoko", "My sweet love");
	}

}
