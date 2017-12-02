
public class SRunnableUser {

	// Main (is also a thread)
	public static void main(String[] args) throws InterruptedException {

		SRunnable sr = new SRunnable();
		
		Thread sr_t = new Thread(sr);
		
		
		sr_t.start();
		
		// main thread is joining to end of "st_t thread"
		// note the print order
		//sr_t.join(); // comment this  line and see interleaving prints 
		
		for (int i =1; i < 100 ; i++){
			
			System.out.println("Main ===>"+i);
		}
	}

}
