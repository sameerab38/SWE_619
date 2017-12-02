import java.util.Vector;

public class IntSet {
   // OVERVIEW: IntSets are unbounded, mutable sets of integers.
   // A typical int set is {x1, x2, x3 ... ,xn}. x1<x2<x3... <xn.   
	
   private Vector<Integer> els; // the rep 
   
   // constructors
   public IntSet(){
      // EFFECTS: Initializes this to be empty.
      els = new Vector<Integer>( ); }

   // methods
   public void insert (int x) {
      // MODIFIES: this
      // EFFECTS: Adds x to the elements of this in correct position
	   //		  such that elements remain sorted.
      Integer y = new Integer(x);
      if (getIndex(y) < 0){
      int i ;
      for(i=0;i<els.size();i++){
    	  if(els.get(i)>x)
    		  break;
    	  else 
    		  continue;
      }
      els.insertElementAt(x, i);
      }
   }

   public void remove (int x) {
      // MODIFIES: this
      // EFFECTS: Removes x from this and the elements remain sorted.
      int i = getIndex(new Integer(x));
      if (i < 0) return;
      
      els.removeElementAt(i);
   }
   
   	
   @Override
public String toString() {
	return "IntSet [els=" + els + "]";
}

public boolean isIn (int x) {
      // EFFECTS: Returns true if x is in this else returns false.
      return getIndex(new Integer(x)) >= 0; }

   private int getIndex (Integer x) {
      // EFFECTS: If x is in this returns index where x appears else returns -1.
      for (int i=0;i< els.size( ); i++)
         if (x.equals(els.get(i))) return i;
      return -1; }

   public int size( ){
      // EFFECTS: Returns the cardinality of this.
      return els.size( ); }

   public int choose ( ) throws EmptyException {
      // EFFECTS: If this is empty throws EmptyException else 
	   // returns an arbitrary element of this.
          if (els.size( ) == 0) throw new EmptyException("IntSet.choose");
          return  els.lastElement( ); }
   
   public boolean isInSortedOrder(){
	   // EFFECTS: Returns true if elements els is in sorted order else returns false
	   for(int i=0;i<els.size()-1;i++){
		   if(els.get(i)> els.get(i+1))
			   return false;	   
	   }
	   return true;
   }
}