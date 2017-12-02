
@SuppressWarnings("serial")
// OVERVIEW: Exception class which gives a message when an object is empty.
public class EmptyException extends Exception {

	public EmptyException(String string) 
	{
		super(string);
	}
}
