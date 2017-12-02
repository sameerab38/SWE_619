public class Pair< F, S > 
{
	// OVERVIEW: This is a generic class which has two type parameters F and S
	// which represent the first and second elements of the pair. 
	
	// The abstract function is 
	// AF(c) = {c.F = firstElement, c.S = secondElement}
	
	// The rep
	private F firstElement; // first element of a pair	
	private S secondElement; // second element of a pair

	// The rep invariant is:
	// firstElement != null && secondElement != null
	
	// Constructor
	/**
	 * Initializes the first and second element of the pair with the given values.
	 * @param f is the first element of the pair.
	 * @param s is the second element of the pair.
	 */
	public Pair(F f, S s)
	{
		// Effects: Initializes the first and second element of the pair with the given values.
		// Throws NullPointerException if either of the values is null.
		firstElement = f;
		secondElement = s;
	} 
	
	// Methods
	/**
	 * Gets the first element of the pair.
	 * @return first element.
	 */
	public F getFirstElement()
	{
		// EFFECTS: Gets the first element of the pair.
		return firstElement;
	}

	/**
	 * Gets the second element of the pair.
	 * @return second element.
	 */
	public S getSecondElement()
	{
		// EFFECTS: Gets the second element of the pair.
		return secondElement;
	}

	/**
	 *  Sets the first element of the pair with the given value, f.
	 * @param f is the first element to be set. 
	 */
	public void setFirstElement(F f)
	{
		// Modifies: this
		// Effects: Sets the first element of the pair with the given value.
		// Throws NullPointerException if the value to be set is null.
		firstElement = f;
	}

	/**
	 * Sets the second element of the pair with the given value, s.
	 * @param s is the second element to be set.
	 */
	public void setSecondElement(S s)
	{
		// Modifies: this
		// Effects: Sets the second element of the pair with the given value.
		// Throws NullPointerException if the value to be set is null.
		secondElement = s;
	}

	@Override
	public String toString() {
		return "Pair [firstElement=" + firstElement + ", secondElement=" + secondElement + "]";
	}
	
	/**
	 * Returns false if the firstElement or the seondElement is null otherwise returns true.
	 * @return true or false
	 */
	public boolean repOk()
	{
		//Effects: Returns false if the firstElement or the seondElement is null otherwise returns true.
		if (firstElement == null || secondElement == null)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
}