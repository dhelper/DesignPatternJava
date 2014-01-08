import java.util.HashMap;
import java.util.Map;


public class CharacterFactory {
	private Map<Character, MyCharacter> _characters = new HashMap<Character, MyCharacter>();
	
	public CharacterFactory(){
		_characters.put('A', new CharacterA());
		_characters.put('B', new CharacterB());
	}
	
	public MyCharacter get(Character key){
		return _characters.get(key);
	}
}
