
public class CalculatorCommand implements ICommand {
	private char _operator;
	private int _operand;
	private Calculator _calculator;
	
	public CalculatorCommand(Calculator _calculator, char _operator,
			int _operand) {
		super();
		this._calculator = _calculator;
		this._operator = _operator;
		this._operand = _operand;
	}

	@Override
	public void Execute() {
		_calculator.Operation(_operator, _operand);
	}

	@Override
	public void Undo() throws Exception {
		_calculator.Operation(Undo(_operator), _operand);

	}

	private char Undo(char operator) throws Exception {
		if(operator == '+') return '-';
		if(operator == '-') return '+';
		if(operator == '*') return '/';
		if(operator == '/') return '*';
		
		throw new Exception("Invalid operator");
	}

}
