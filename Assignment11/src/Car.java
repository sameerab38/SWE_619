public class Car extends Transport
{
	Car()
	{ 
		System.out.print("h ");
	}
	Car(String name)
	{
		this();
		System.out.print("hn " + name);
	}
	public static void main(String args[])
	{
		new Car("x ");
	}
}
