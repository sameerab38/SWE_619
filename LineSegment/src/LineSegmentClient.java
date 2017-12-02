
public class LineSegmentClient
{
	// Overview: Client class to use the methods and constructors in the LineSegment class.
	public static void main(String args[]) throws LineSegmentLengthException
	{	
		Point2d p1 = new Point2d(1,1); // Creates a point
		Point2d p2 = new Point2d(1,2); // Creates a point.
		
		LineSegment lineSegment = new LineSegment(p1,p2); // Created the LineSegment object.
		
		System.out.println(lineSegment.toString());
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		
		double length = lineSegment.getSegmentLength(); // Gets the length of the line segment.
		System.out.println("Length of the line segment is: " + length);
		
		Point2d startPoint = lineSegment.getStartPoint(); // Gets the start point of the line segment.
		System.out.println(startPoint.toString());
		
		Point2d endPoint = lineSegment.getEndPoint(); // Gets the end point of the line segment.
		System.out.println(endPoint.toString());
	}
}
