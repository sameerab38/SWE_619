import org.junit.Test;

public class LineSegmentTester
{
	// OVERVIEW: This class tests all the methods and constructors of LineSegment class.
	private LineSegment ls;
	private Point2d p1 = new Point2d(0,1);
	private Point2d p2 = new Point2d(0,2);

	@Test
	public void testLineSegment() throws LineSegmentLengthException
	{
		// Effects: Validates the constructor of the class LineSegment.
		ls = new LineSegment(p1,p2); // Creates an object of type LineSegment.	
		assert(ls != null); // Asserts if the object 'ls' is null.
	}

	@Test
	public void testGetSegmentLength() throws LineSegmentLengthException
	{
		// Effects: Validates and verifies the GetSegmentLength method.
		double expectedSegmentLength = 1.0;
		ls = new LineSegment(p1,p2); // Creates an object of type LineSegment.
		double obtainedSegmentLength = ls.getSegmentLength(); // Gets the length of the line segment.
		assert(obtainedSegmentLength != 0); // Asserts if the obtained segment length is null.
		if(obtainedSegmentLength != expectedSegmentLength)
		{
			System.out.println("testGetSegmentLength method failed.");
		}
		else
		{
			System.out.println("testGetSegmentLength method passed.");
		}
	}

	@Test
	public void testGetStartPoint() throws LineSegmentLengthException
	{
		// Effects: Validates and verifies the GetStartPoint method.
		Point2d expectedStartPoint = new Point2d(0.0, 1.0);
		ls = new LineSegment(p1,p2); // Creates an object of type LineSegment.
		Point2d obtainedStartPoint = ls.getStartPoint(); // Gets the start point of the line segment.
		assert(obtainedStartPoint != null); // Asserts if the obtainedStartPoint is null.
		if(obtainedStartPoint.equals(expectedStartPoint))
		{
			System.out.println("testGetStartPoint method failed.");
		}
		else
		{
			System.out.println("testGetStartPoint method passed.");
		}
	}

	@Test
	public void testGetEndPoint() throws LineSegmentLengthException
	{
		// Effects: Validates and verifies the GetEndPoint method.
		Point2d expectedEndPoint = new Point2d(0.0, 2.0);
		ls = new LineSegment(p1,p2);
		Point2d obtainedEndPoint = ls.getEndPoint(); // Gets the end point of the line segment.
		assert(obtainedEndPoint != null); // Asserts if the obtainedEndPoint is null.
		if(obtainedEndPoint.equals(expectedEndPoint))
		{
			System.out.println("testGetEndPoint method failed.");
		}
		else
		{
			System.out.println("testGetEndPoint method passed.");
		}
	}
}
