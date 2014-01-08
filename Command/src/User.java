import java.util.ArrayList;
import java.util.List;


public class User {
	private Calculator _calculator = new Calculator();
	private List<ICommand> _commands = new ArrayList<ICommand>();
	private int _current;
	
	public void Redo(int levels){
		System.out.println("Redo " + levels + " levels");
		
		for(int i = 0; i < levels ; i++){
			if(_current < _commands.size() - 1){
				_commands.get(_current).Execute();
			}
		}
	}
	
	public void Undo(int levels) throws Exception{
		System.out.println("Undo " + levels + " levels");
		
		for(int i = 0 ; i < levels ; i++){
			if(_current > 0){
				_commands.get(--_current).Undo();
			}
		}
	}
	
	public void Compute(char operator, int operand){
		ICommand command = new CalculatorCommand(_calculator, operator, operand);
		command.Execute();
		_commands.add(command);
		_current++;
	}
}
