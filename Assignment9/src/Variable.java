public class Variable<V>
{
	// OVERVIEW: This is a generic class which has one type parameter V to accept any value.
	// This class has methods to get the value of variable, set the value on variable 
	// and swap the values of two variables given they are of same type.
	
	// The abstract function is 
	// AF(c) = {c.V = value}
	
	//The rep
	private V value;
	
	// The rep invariant is:
	// value != null
	
	// Constructor
	public Variable(V _value)
	{
		// Effects: Initializes the value of variable with the given value.
		// Throws NullPointerException if the value is null.
		this.value = _value;
	}
	
	// Methods
	public void setValue(V newValue)
	{
		// Modifies: this
		// Effects: Sets the current value of variable with the given new value
		// provided  the value to be set should be of same type as the already containing value.
		this.value = newValue;
	} // setValue(V newValue)
	
	public V getValue()
	{
		// EFFECTS: Returns the value of this.
		return this.value;
	} // getValue()
	
	public void swap(Variable<V> other)
	{
		// MODIFIES: this
		// EFFECTS: Swaps the values in this and the given variable.  
		V tmp = this.value; // Stores the value in temp.
		this.setValue(other.getValue());
		other.setValue(tmp);
	} // swap(Variable other)
	
	@Override
	public String toString()
	{
		return "Variable [value=" + value + "]";
	}
	
	public boolean repOk()
	{
		//Effects: Returns false if the value is null otherwise returns true.
		if (value == null)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
} // class Variable<V>
