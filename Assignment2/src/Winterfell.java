
public class Winterfell {
	
		private Winterfell someInstance;// = new Winterfell();
		
		public Winterfell() throws Exception 
		{
			throw new Exception("Fire and Ice");
		}
		public static void main(String[] args)
		{
			try
			{
				Winterfell b = new Winterfell();
				System.out.println("Surprise!");
			} 
			catch (Exception ex)
			{
				System.out.println("I told you so");
			}
		}

}
