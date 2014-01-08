
public interface IChatRoom {
	void Register(Participant participant);
	void Send(String from, String to, String message);
}
