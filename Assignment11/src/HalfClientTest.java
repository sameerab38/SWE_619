import java.io.IOException;
import java.util.Scanner;

public class HalfClientTest
{
	public static void main(String[] args) throws IOException
	{
		int[] valueArray = new int[10];
		Scanner inp = new Scanner (System.in);
		System.out.println("Enter 10 integers:");
		for(int i = 0; i < valueArray.length; i++)
		{
			valueArray[i] = inp.nextInt();			
		}
		inp.close();
		System.out.println("Result: ");
		int[] r = HalfClientTest.halfArray(valueArray);
		for(int i = 0; i < r.length; i++)
		{
			System.out.println(r[i]);
		}		
	}
	
	private static int[] halfArray(int[] valueArray)
	{
		Half halver  = Half.valueOf();// call to static factory method
		
		int[] result = new int[valueArray.length];
		
		for(int i = 0; i < result.length; i++)
		{
			result[i] = halver.evaluate(valueArray[i]);
		}
		
		return result;
	}
}
