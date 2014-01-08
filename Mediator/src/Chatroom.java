import java.util.HashMap;
import java.util.Map;

public class Chatroom implements IChatRoom {
	private Map<String, Participant> _participants = new HashMap<String, Participant>();
	
	@Override
	public void Register(Participant participant) {
		if(!_participants.containsKey(participant.get_name())){
			_participants.put(participant.get_name(), participant);
		}

		participant.set_chatroom(this);
	}

	@Override
	public void Send(String from, String to, String message) {
		Participant reciever = _participants.get(to);
		reciever.Recieve(from, message);
	}

}
