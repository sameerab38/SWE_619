import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.NoSuchElementException;

import org.junit.Test;

public class TreeTester
{
	// OVERVIEW: Tester class for the Tree class to verify its constructors and methods.
	private Tree t;
	@Test
	public void testTree()
	{
		// EFFECTS: Verifies the constructors of the Tree class.
		t = new Tree(); // Constructs an empty Tree object t.
		assertNotNull(t); // Verifies if the empty tree object is null.
		t = new Tree(6); // Constructs an Tree object t with mid value = 6.
		assertNotNull(t);
	}

	@Test
	public void testIsEmpty()
	{
		// EFFECTS: Verifies the isEmpty method.
		t = new Tree(6);
		boolean isEmpty = t.isEmpty();
		if (!isEmpty)
		{
			System.out.println("Test isEmpty method passed.");
		}
		else
		{
			System.out.println("Test isEmpty method failed.");
		}
	}

	@Test
	public void testAdd() throws DuplicateException
	{
		// EFFECTS: Validates and verifies the add method.
		t = new Tree();
		t.add(6);
		t.add(3);
		t.add(1);
		t.add(8);
		if (t.isEmpty())
		{
			System.out.println("Test add method failed.");	
		}
		else
		{
			try
			{
				t.add(6);
			}
			catch (DuplicateException de)
			{
				System.out.println("Expected exception as the element 6 already exists in the Tree.");
			}
			System.out.println("Test add method passed." + t.toString());
		}
		
	}

	@Test
	public void testTreeInOrderIterator() throws DuplicateException
	{
		// EFFESTS: Verifies the TreeInOrderIterator iterator and its generator.
		t = new Tree(6);
		t.add(3);
		t.add(1);
		t.add(8);
		System.out.println(t.toString());
		
		@SuppressWarnings("rawtypes")
		Iterator it = t.treeInOrderIterator() ;
		
		assertEquals(it.hasNext(), true);		
		assertEquals(it.next(),1);
		assertTrue(it.hasNext());
		assertEquals(it.next(),3);
		assertTrue(it.hasNext());
		assertEquals(it.next(),6);
		assertTrue(it.hasNext());
		assertEquals(it.next(),8);
		assertFalse(it.hasNext());
		
		t = new Tree();
		it = t.treeInOrderIterator() ;
		assertEquals(it.hasNext(), false);
		try
		{
			it.next();
		}
		catch(NoSuchElementException nse)
		{
			System.out.println("expected Exception as there is no next element");
		}
		
	}

}
