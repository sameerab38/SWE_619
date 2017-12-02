public class VariableTestClient
{
	public static void main(String[] args)
	{
		// Create an integer variable, variableInt1.
		Variable<Integer> variableInt1 = new Variable<Integer>(2);
		System.out.println("Original value of variableInt1 after creation: " + variableInt1.toString());

		// Create a character variable, variableChar1.
		Variable<Character> variableChar1 = new Variable<Character>('b');
		System.out.println("Original value of variableChar1 after creation: " + variableChar1.toString());
		
		int i = variableInt1.getValue(); // Get the value of integer variable, variableInt1.
		System.out.println("Initial value of variableInt1: " + i);
		
		variableInt1.setValue(1); // Set another value to integer variable, variableInt1.
		System.out.println("Value of variableInt1 after set: " + variableInt1.toString());
		
		Variable<Integer> variableInt2 = new Variable<Integer>(3); // Create another integer variable, variableInt2.
		System.out.println("Before swapping: " + variableInt1.toString() + " " + variableInt2.toString());
		variableInt1.swap(variableInt2); // Swap the values of the variableInt1 and variableInt2.
		System.out.println("After swapping: " + variableInt1.toString() + " " + variableInt2.toString());
		
		char c = variableChar1.getValue(); // Get the value of character variable, variableChar1.
		System.out.println("Initial value of variableChar1: " + c);
		
		variableChar1.setValue('c'); // Set another value to character variable, variableChar1.
		System.out.println("Value of variableChar1 after set: " + variableChar1.toString());
		
		Variable<Character> variableChar2 = new Variable<Character>('a'); // Create another character variable, variableChar2. 
		System.out.println("Before swapping: " + variableChar1.toString() + " " + variableChar2.toString());
		variableChar1.swap(variableChar2); // Swap the values of the variableChar1 and variableChar2.
		System.out.println("After swapping: " + variableChar1.toString() + " " + variableChar2.toString());
	}
}
