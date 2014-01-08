
public class Runner {

	public static void main(String[] args) {
		String myDoc = "AAABBAAB";
		char[] myChars = myDoc.toCharArray();

		CharacterFactory factory = new CharacterFactory();
		
		int pointSize = 10;
		
		for(char c : myChars){
			MyCharacter currentCharacter = factory.get(c);
			
			currentCharacter.display(pointSize++);
		}
	}

}
