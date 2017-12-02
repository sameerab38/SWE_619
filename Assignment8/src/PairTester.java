import org.junit.Test;

public class PairTester
{
	Pair<Integer, Double> pairTest;
	@Test
	public void testPair()
	{
		// Create a Pair object pairTest with an Integer, Double pair.
		pairTest = new Pair<Integer, Double>(8, 8.8);
		assert(pairTest != null); // Verify if the pairTest is null or not. 
		System.out.println("Original pair is: " + pairTest.toString()); // Print the pairTest object.
	}

	@Test
	public void testGetFirstElement()
	{
		pairTest = new Pair<Integer, Double>(8, 8.8);
		int firstElement = pairTest.getFirstElement(); // Get first element from the pair.
		if(firstElement != 8) // Verify if first element of the pair is 8 or not.
		{
			System.out.println("GetFirstElement test failed. Expected first element is 8, "
					+ "but the obtained first element is: " + firstElement);
		}
		System.out.println("GetFirstElement test passed.");
	}

	@Test
	public void testGetSecondElement()
	{
		pairTest = new Pair<Integer, Double>(8, 8.8);
		double secondElement = pairTest.getSecondElement(); // Get second element from the pair.
		if(secondElement != 8.8) // Verify if second element of the pair is 8.8 or not. 
		{
			System.out.println("GetSecondElement test failed. Expected second element is 8.8, "
					+ "but the obtained second element is: " + secondElement);
		}
		System.out.println("GetSecondElement test passed.");
	}

	@Test
	public void testSetFirstElement()
	{
		pairTest = new Pair<Integer, Double>(8, 8.8);
		pairTest.setFirstElement(7); // Set first element in the pair.
		int afterFirstElementSet = pairTest.getFirstElement();
		if(afterFirstElementSet != 7) // Verify if first element of the pair is set to 7.
		{
			System.out.println("SetFirstElement test failed. Expected first element after set is 7, "
					+ "but the obtained first element is: " + afterFirstElementSet);
		}
		System.out.println("SetFirstElement test passed.");
	}

	@Test
	public void testSetSecondElement()
	{
		pairTest = new Pair<Integer, Double>(7, 8.8); 
		pairTest.setSecondElement(7.7); // Set second element in the pair.
		double afterSecondElementSet = pairTest.getSecondElement();
		if(afterSecondElementSet != 7.7) // Verify if second element of the pair is set to 7.7.
		{
			System.out.println("SetSecondElement test failed. Expected second element after set is 7.7, "
					+ "but the obtained second element is: " + afterSecondElementSet);
		}
		System.out.println("SetSecondElement test passed.");
	}
}
