import java.util.InputMismatchException;
import java.util.Scanner;

class TreeOriginal 
{
	// OVERVIEW: This class takes integers as input and sorts them in ascending order. 
	// The implementation of TreeOriginal uses a sorted tree.
	
	// The rep
	public final int mVal;
	public TreeOriginal mLeft;
	public TreeOriginal mRight;
	
	// Constructors
	public TreeOriginal(int val) 
	{
		//Effects: Initializes this with a value and that value is considered as the mid value.
		mVal = val;
	}
	
	// Methods
	public void add(int val) 
	{
		// Modifies: this
		// EFFECTS: Adds the element val to this such that the value less than mVal are stored in mLeft and
		// value greater than mVal are stored in mRight
		if (val < mVal) 
		{
			if (mLeft == null)
				mLeft = new TreeOriginal(val);
			else
				mLeft.add(val);
		}
		else if (val > mVal)
		{
			if (mRight == null)
				mRight = new TreeOriginal(val);
			else
				mRight.add(val);
		}
	}

	public String inOrder()
	{
		// Modifies: this
		// Effects: Sorts the elements from the tree in an ascending order.
		return ((mLeft == null) ? "" : mLeft.inOrder())
				+ mVal + " "
				+ ((mRight == null) ? "" : mRight.inOrder());
	}


	public static void main(String[] args)
	{
		// Effects: scans values from the user and adds to the Tree.
		// Throws InputMismatchException if the type of the input is not an integer.
		TreeOriginal t = new TreeOriginal(8);
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		@SuppressWarnings("unused")
		boolean continueLoop = true; // determines if more input is needed
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

		System.out.println("Values in order = "
				+ t.inOrder());
	}
}