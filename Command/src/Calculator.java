
public class Calculator {
	private int _current;
	public void Operation(char operator, int operand){
		if(operator == '+'){
			_current += operand;
		}
		
		if(operator == '-'){
			_current -= operand;
		}
		
		if(operator == '*'){
			_current *= operand;
		}
		
		if(operator == '/'){
			_current /= operand;
		}
		
		System.out.println("Value: " + _current + "(" + operator +" " + operand + ")");
	}
}
