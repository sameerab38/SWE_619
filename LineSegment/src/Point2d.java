public class Point2d 
{
	// OVERVIEW: Point2d is a class for creating point in a 2d space 
	// which has x coordinate and y coordinate.
	
	// The rep
	private double xCoordinate;
	private double yCoordinate;
	
	// Constructor
	public Point2d(double x, double y)
	{
		// Effects: Initializes this to be a 2d point with x coordinate and y coordinate.
		 this.xCoordinate = x;
		 this.yCoordinate = y;
	}
	
	// Observers/ Methods
	public double getxCoordinate()
	{
		// Effects: Returns the x coordinate of this.
		return xCoordinate;
	}

	public double getyCoordinate()
	{
		// Effects: Returns the y coordinate of this.
		return yCoordinate;
	}

	@Override
	public String toString()
	{
		return "Point2d [xCoordinate=" + xCoordinate + ", yCoordinate=" + yCoordinate + "]";
	}
	
	
}
