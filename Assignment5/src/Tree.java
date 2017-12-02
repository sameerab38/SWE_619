import java.util.Iterator;
import java.util.NoSuchElementException;

class Tree 
{
	// OVERVIEW: This class takes integers as input and sorts them in ascending order. 
	// The implementation of TreeOriginal uses a sorted tree.

	// The rep
	private boolean empty;
	private  int mVal;
	private Tree mLeft;
	private Tree mRight;

	// Constructors
	public Tree() 
	{
		// EFFECTS:	Initializes this to be an empty Tree.
		this.empty = true;
	}

	public Tree(int val) 
	{
		//Effects: Initializes this with a value and that value is considered as the mid value.
		this.empty = false;
		mVal = val;
	}

	// Methods
	public boolean isEmpty()
	{
		// EFFECTS: Returns true if this is empty else returns false. 
		return (this.empty == true);
	}

	public void add(int val) throws DuplicateException
	{
		// Modifies: this
		// EFFECTS: if  val is in this throws Duplicate Exception else
		// Adds the element val to this such that the value less than mVal are stored in mLeft and
		// value greater than mVal are stored in mRight.
		
		if(this.empty)
			{
			this.mVal = val;
			this.empty = false;
			return;
			}
		
		if (val < mVal) 
		{
			if (mLeft == null){
				mLeft = new Tree(val);
			}
			else
				mLeft.add(val);
		}
		else if (val > mVal)
		{
			if (mRight == null){
				mRight = new Tree(val);
			}
			else
				mRight.add(val);
		}
		else if (val == mVal)
			throw new DuplicateException("Tree.add(): Value already exists!");
	}

	@Override
	public String toString() {
		return "Tree [mVal=" + mVal + ", mLeft=" + mLeft + ", mRight=" + mRight + "]";
	}

	// Following iterator and generator code is written with reference to the Liskov textbook section 6.6
	@SuppressWarnings("rawtypes")
	public Iterator treeInOrderIterator ()
	{
		// Modifies: this
		// Effects: Sorts the elements from the tree in an ascending order.
		return new TreeGen(this, count());
	}

	private int count()
	{
		if (this.isEmpty())
		{
			return 0;
		}
		else
		{
			int re = 1;
			if(mLeft!=null)
				re+=mLeft.count();
			if(mRight!=null)
				re+=mRight.count();

			return re;
		}
	}

	// Inner Class
	@SuppressWarnings("rawtypes")
	private static class TreeGen implements Iterator
	{
		private int cnt;
		private TreeGen child;
		private Tree me;

		TreeGen(Tree tree, int count)
		{
			// Requires tree!=null
			cnt = count;
			if(cnt > 0) {
				me = tree ;
				if(tree.mLeft != null)
					child = new TreeGen(tree.mLeft, tree.mLeft.count());
			}
		}

		public boolean hasNext()
		{
			// Effects: Returns true if there is an element next to the current element else returns false.
			return (cnt > 0);
		}

		public Object next() throws NoSuchElementException
		{
			// Effects: Returns the next element if there is any next element to the current element.
			// If there is no next element in the branch of the tree, catches NoSuchElementException and
			// does nothing to continue getting the right branch tree elements.
			if(cnt == 0)
			{
				throw new NoSuchElementException("Tree.treeInOrderIterator");
			}		
			cnt -- ;

			try
			{
				if(child!=null)
				{
					return new Integer((Integer) child.next());
				}		
			}
			catch(NoSuchElementException nse)
			{
				// do nothing
			}
			child = new TreeGen(me.mRight,cnt);
			return new Integer(me.mVal);			
		}

	}
}