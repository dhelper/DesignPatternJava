
public class Participant {
	private String _name;
	private Chatroom _chatroom;
	
	public Participant(String name){
		_name = name;
	}
	
	public void Send(String to, String message){
		get_chatroom().Send(get_name(), to, message);
	}
	
	public void Recieve(String from, String message){
		System.out.println(from + " --> " + _name + ":" + message);
	}

	public String get_name() {
		return _name;
	}

	public void set_name(String _name) {
		this._name = _name;
	}

	public Chatroom get_chatroom() {
		return _chatroom;
	}

	public void set_chatroom(Chatroom _chatroom) {
		this._chatroom = _chatroom;
	}
}
