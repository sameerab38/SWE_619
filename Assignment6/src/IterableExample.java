import java.util.ArrayList;
import java.util.Iterator;

public class IterableExample implements Iterable<String> {

	// rep for a set of Strings
	ArrayList<String> ar ;
	
	public Iterator<String> iterator() {
		// This is an example of how the generator class object may be created using state of outer class
		return new InnerGenerator(this.ar);
	}
	
	
	// This is how the inner class for generator should be defined
	private static class InnerGenerator implements Iterator<String>{

		public InnerGenerator(ArrayList<String> ar) {
			// Not defining the constructor. Just illustrating usage.
		}

		public boolean hasNext() {
			// TODO Auto-generated method stub
			return false;
		}

		public String next() {
			// TODO Auto-generated method stub
			return null;
		}
	}
	

	// This is the client code 
	public static void main(String[] args){
		
		IterableExample ie = new IterableExample();
		// Example of how the for each loop may be used on the Container class "IterableExample"
		// to generate one element (String in this case) at a time
		for(String s:ie){
			// do something, say print
			System.out.println(s);
		}
	}


}
