public class LineSegmentLengthException extends Exception 
{
	// OVERVIEW: Exception class which gives a message when the length of the line segment 
	// is zero or less than zero.
	
	private static final long serialVersionUID = -5392289364043198376L;

	public LineSegmentLengthException(String string)
	{
		super(string);
	}
}

