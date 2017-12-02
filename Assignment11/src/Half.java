public class Half implements Function
{
	// OVERVIEW: This class has a method evaluate which takes an integer value and divides into half.
	// Private constructor
	private Half()
	{

	}
	/*
	 * Static factory method to create an instance of Half.
	 */
	//static factory method
	public static Half valueOf()
	{
		return new Half();
	}

	/*
	 * @see This function returns an integer which is half of the given integer.
	 */
	@Override
	public int evaluate(int value)
	{		
		// Effects: Returns half of the given value.
		int newValue = value/2;
		return newValue;
	}
}
