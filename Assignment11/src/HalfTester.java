import org.junit.Test;

public class HalfTester
{
	Half halver;
	@Test
	public void testValueOf()
	{
		halver  = Half.valueOf();// call to static factory method
		assert(halver != null); // // Asserts if the object 'halver' is null.
	}

	@Test
	public void testEvaluate()
	{
		// Validates the evaluate() method.
		halver  = Half.valueOf();
		int result = halver.evaluate(10);
		if(result == 5)
		{
			System.out.println("Testing Evaluate method passed:" + result);
		}
		else
		{
			System.out.println("Testing Evaluate method failed:" + result);
		}
	}
}
