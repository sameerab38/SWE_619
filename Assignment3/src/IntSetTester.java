import static org.junit.Assert.*;

import org.junit.Test;

public class IntSetTester 
{
	// OVERVIEW: This class tests all the methods and constructors of he IntSet class. 
	// This class validates and verifies the correctness of the implementation 
	// in the IntSet class.

	IntSet is = new IntSet(); // Creates an object of type IntSet.
	boolean testPassed;
	
	@Test
	// Effects: Validates the constructor of the class IntSet
	public void testIntSet() 
	{		
		assert(is!=null); // Asserts if the object 'is' is null.
		assert(is.size()==0); // Asserts if the size of the object 'is' is zero.
	}

	@Test
	// Effects: Validates and verifies the insert method.
	public void testInsert() 
	{
		System.out.println("Testing the Insert method.");
		 is.insert(2); // Inserts the element 2.
		 is.insert(3); // Inserts the element 3.
		 is.insert(7); // Inserts the element 7.
		 // Compares the obtained value(is.size) and expected value(3) and 
		 // asserts if they are not equal.
		 assertEquals(is.size(),3); 
		 System.out.println("After inserting the elements 2,3,7: " + is.toString());
		 
		 is.insert(7);
		 // Compares the obtained value(is.size) and expected value(3) and 
		 // asserts if they are not equal.
		 // Here the size should not change since a duplicate element is inserted 
		 //  Insert method does not accept the duplicates.
		 assertEquals(is.size(),3);
		 System.out.println("After inserting the duplicate element 7: " + is.toString());

		 is.insert(4); // Inserts the element 4.
		 // Compares the obtained value(is.size) and expected value(4) and 
		 // asserts if they are not equal.
		 assertEquals(is.size(),4);		 
		 // Verifies whether the inserted elements are in sorted order.
		 assertTrue(is.isInSortedOrder());
		 System.out.println("After inserting the element 4: " + is.toString());
		 
		 is.insert(-1); // Inserts the element -1.
		 // Compares the obtained value(is.size) and expected value(5) and 
		 // asserts if they are not equal.
		 assertEquals(is.size(),5);
		 // Verifies whether the inserted elements are in sorted order.
		 assertTrue(is.isInSortedOrder());
		 System.out.println("After inserting the element -1: " + is.toString());
	}

	@Test
	// Effects: Validates and verifies the remove method.
	public void testRemove()
	{
		//Insert 5 elements into the intSt 'is'.
		is.insert(2);
		is.insert(3);
		is.insert(7);
		is.insert(4);
		is.insert(-1);
		System.out.println("Testing the Remove method.");
		System.out.println("After inserting 5 elements: " + is.toString());
		 is.remove(3); // Removes the element 3 from the IntSet.
		 // Verifies if the IntSet object'is' is in sorted order.
		 assertTrue(is.isInSortedOrder()); 
		 // Compares the obtained value(is.size) and expected value(4) and 
		 // asserts if they are not equal.
		 assertEquals(is.size(), 4);
		 System.out.println(is.toString());
		 // Verifies if the element 3 is still in the IntSet or is removed.
		 assertFalse(is.isIn(3));
		 
		 // Attempting to remove the element 141 from the intSet which is not in the IntSet.
		 is.remove(141); 
		 // Compares the obtained value(is.size) and expected value(4) and 
		 // asserts if they are not equal.
		 assertEquals(is.size(), 4);	 
	}

	@Test
	// Effects: Validates and verifies the IsIn method.
	public void testIsIn()
	{
		testPassed = false;
		// The element 2 is in 'is'. Therefore isIn method should return true.
		boolean a = is.isIn(2);
		if(a)
		{
			testPassed = true;
		}
		// The element 8 is not in 'is'. Therefore isIn method should return false.
		boolean b = is.isIn(8);
		if(!b)
		{
			testPassed = true;
		}
		if(testPassed)
		{
			System.out.println("TestIsIn method passed.");
		}
		else
		{
			System.out.println("TestIsIn method failed.");
		}
	}

	@Test
	// Effects: Validates and verifies the size method.
	public void testSize() 
	{
		testPassed = false;
		// Insert 4 elements into the intSet 'is'.
		is.insert(2);
		is.insert(3);
		is.insert(7);
		is.insert(4);
		int expectedSize = 4;
		int obtainedSize = is.size();
		// Five distinct elements are elements are inserted into the intSet 'is' and 
		// one element is removed from it. Therefore the size should be 4.
		if(expectedSize == obtainedSize)
		{
			testPassed = true;
			System.out.println("testSize method passed.");
		}
		else
		{
			System.out.println("testSize method failed.");
		}
	}

	@Test
	// Effects: Validates and verifies the choose method.
	public void testChoose() 
	{
		// Creating and instantiating a new object of type IntSet.
		IntSet is_empty = new IntSet();
		// Attempting to choose an arbitrary element from the empty IntSet object 
		// which throws an exception and it is expected.
		try
		{
			is_empty.choose();
		}
		catch(EmptyException ee)
		{
			System.out.println("Expected Exception as the IntSet object is empty.");
		}
	}

}
