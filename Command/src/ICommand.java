
public interface ICommand {
	void Execute();
	void Undo() throws Exception;
}
