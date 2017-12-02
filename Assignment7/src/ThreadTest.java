import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ThreadTest
{
	public static void main(String[ ] args)
	{
		int nThreads = 1;
		BufferedReader keyboard;
		InputStreamReader reader;
		reader = new InputStreamReader(System.in);
		keyboard  = new BufferedReader(reader);
		String InputText = "";
		try
		{
			System.out.print("Input Number of Threads = ");
			InputText = keyboard.readLine( );
		}
		catch (IOException e)
		{
			System.err.println("Problem with input stream");
			e.printStackTrace();
		}
		nThreads = Integer.parseInt(InputText);
		long n = 0;
		try
		{
			System.out.print("Input factorial (n) = ");
			InputText = keyboard.readLine( );
		} 
		catch (IOException e)
		{
			System.err.println("Problem with input stream");
			e.printStackTrace();
		}
		n = Long.parseLong(InputText);
		Thread t[] = new Thread[nThreads];
		
		// initializing threads and starting them
		for (int i = 0; i < t.length; i++)
		{
			t[i] = new Thread((Runnable)new Task(n, "Task " + i));
			t[i].setPriority((i % 10) + 1);
			t[i].start();
		}
		
		
		// making main method wait for all threads to finish
		for (int i = 0; i < t.length; i++)
		{
			try
			{
				t[i].join();
			} 
			catch (InterruptedException ie) {}
		}
		
		
	}
}