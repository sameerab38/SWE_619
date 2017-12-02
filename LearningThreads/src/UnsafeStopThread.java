import java.util.concurrent.TimeUnit;

public class UnsafeStopThread {
	private static boolean stopRequested;
	public static void main (String[] args)
			throws InterruptedException {
		
		
		Thread backgroundThread = new Thread(new Runnable() {
			public void run() { // May run forever!
				int i=0; while (! stopRequested){ System.out.println("Unsafe" + i); i++;} // See below
			}});
		
		
		backgroundThread.start();
		TimeUnit.SECONDS.sleep(1);
		stopRequested = true;
	} }
