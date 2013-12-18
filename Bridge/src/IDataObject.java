/*
 * The implementor interface
*/
public interface IDataObject<T> {
	void nextRecord();
	void priorRecord();
	void addRecord(T t);
	void deleteRecord(T t);
	T getCorrectRecord();
	void showRecord();
	void showAllRecords();
}
