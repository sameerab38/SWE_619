import static org.junit.Assert.*;

import org.junit.Test;

public class TreeOriginalTester
{
	// OVERVIEW: Tester class for the TreeOriginal class to verify its constructors and methods.
	@Test
	public void testTreeOriginal()
	{
		TreeOriginal to = new TreeOriginal(6);
		assertNotNull(to);
	}

	@Test
	public void testAdd()
	{
		TreeOriginal to = new TreeOriginal(6);
		assertNotNull(to);
		to.add(1);
		assertEquals( to.inOrder().trim(),"1 6" );
	}

	@Test
	public void testInOrder()
	{
		TreeOriginal to = new TreeOriginal(6);
		to.add(3);
		to.add(1);
		to.add(8);
		assertEquals( to.mLeft.inOrder().trim(),"1 3" );// Here we are using mLeft which is the exposed rep.
		assertEquals( to.mRight.inOrder().trim(),"8" );// Here we are using mRight which is the exposed rep.
	}

}
