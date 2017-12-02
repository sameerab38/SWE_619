import org.junit.Test;

public class VariableTester
{
	Variable<String> variableString1;
	String s;
	@Test
	public void testVariable()
	{
		// Create a variable with String type
		variableString1 = new Variable<String>("Me");
		assert(variableString1 != null); // Verify if the variableString1 is null.
		System.out.println("Original variable: " + variableString1.toString()); // Print the created variableString1 object.
	}

	@Test
	public void testSetValue()
	{
		variableString1 = new Variable<String>("Me");
		s = variableString1.getValue();
		variableString1.setValue("You"); // Sets the value of variableString1 to "You".
		String afterSetValue = variableString1.getValue();
		if (afterSetValue == s || afterSetValue != "You") // Verifies if the the value is set correct.
		{
			System.out.println("Test setValue method failed.");
		}
		else
		{
			System.out.println("Test setValue method passed.");
			System.out.println("After set: " + variableString1.toString());
		}
	}

	@Test
	public void testGetValue()
	{
		variableString1 = new Variable<String>("Me");
		s = variableString1.getValue(); // gets the value of variableString1.
		
		if (s != "Me") // Verifies if the expected value is gotten.
		{
			System.out.println("Test getValue method failed.");
		}
		else
		{
			System.out.println("Test getValue method passed.");
		}
	}

	@Test
	public void testSwap()
	{
		variableString1 = new Variable<String>("Me");
		Variable<String> variableString2 = new Variable<String>("Swapped.");
		System.out.println("Before swapping: " + variableString1.toString() + " " + variableString2.toString());
		variableString1.swap(variableString2); // Swaps the values of variableString1 and variableString2.
		if(variableString1.getValue() != "Swapped." || variableString2.getValue() != "Me") // Verifies if the values are swapped correctly.
		{
			System.out.println("Test Swap method failed.");
		}
		else
		{
			System.out.println("Test Swap method passed.");
			System.out.println("After swapping: " + variableString1.toString() + " " + variableString2.toString());
		}
	}

}
