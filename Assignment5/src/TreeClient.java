import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class TreeClient
{
	public static void main(String[] args) throws DuplicateException
	{
		// Effects: scans values from the user and adds to the Tree.
		// Throws InputMismatchException if the type of the input is not an integer.
		Tree t = new Tree(6);
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		for (int i = 1; i < 9; ++i)
		{
			try // read 
			{
				System.out.print("Please enter a random integer : ");
				int stackInt = scanner.nextInt();
				t.add(Integer.valueOf(stackInt));
			} // end try
			catch (InputMismatchException inputMismatchException)
			{
				System.err.printf("\nException: %s\n", inputMismatchException);
				scanner.nextLine(); //discard input so user can try again
				System.out.println("You must enter integers. Please try again.\n");
			} // end catch

		}

		@SuppressWarnings("rawtypes")
		Iterator it = t.treeInOrderIterator() ;

		System.out.println("Values in order = ");
		while(it.hasNext()) {
		System.out.print(" "
				+ ((Integer)it.next()));
		}
	}
}
