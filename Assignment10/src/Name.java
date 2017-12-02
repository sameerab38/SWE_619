import java.util.HashSet;
import java.util.Set;

public class Name
{
	// OVERVIEW: This class has a constructor which creates first name and last name.
	
	// The rep
	private final String first, last;
	
	// Constructor
    public Name(String first, String last)
    {
    	// Effects: Assigns the variables: first and last with given variables: first and last respectively.
        this.first = first;
        this.last = last;
    }
    
    // Methods
    @Override
	public int hashCode()
    {
    	// Effects: Returns a hash code value for the Name object.
		final int prime = 31;
		int result = 1;
		result = prime * result + ((first == null) ? 0 : first.hashCode());
		result = prime * result + ((last == null) ? 0 : last.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object o)
    {
    	if (!(o instanceof Name))
        {
        	return false;
        }
        Name n = (Name)o;
        return n.first.equals(first) && n.last.equals(last);
    }
	
    @Override
	public String toString()
    {
		return "Name [first=" + first + ", last=" + last + "]";
	}

	public static void main(String[] args)
    {
    	// Validates the Name class constructor and methods.
        Set<Name> s = new HashSet<Name>();
        s.add(new Name("Mickey", "Mouse"));
        System.out.println(s.contains(new Name("Mickey","Mouse")));
    }
}
