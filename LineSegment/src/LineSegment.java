public class LineSegment 
{

	// OVERVIEW: LineSegment is defined by a start point (x1, y1) and an end point (x2, y2).
	// The start point and end point have x and y coordinates.
	// The abstract function is
	// AF(c) = {c.startPoint.xCoordinate = x1, c.startPoint.yCoordinate = y1, c.endPoint.xCoordinate = x2, c.endPoint.yCoordinate = y2}

	// The rep
	private Point2d startPoint;
	private Point2d endPoint;
	private double segmentlength;
	
	// The rep invariant is:
	// startPoint != null && endPoint != null && segmentLength != 0
	// length = (difference of x coordinates)^2 + (difference of x coordinates)^2


	//Constructors
	public LineSegment(Point2d startPoint, Point2d endPoint) throws LineSegmentLengthException
	{
		// Effects: Initializes this to be a line segment with a start point and an end point.
		// Throws LineSegmentLengthException if the length of the line segment is 0.
		this.startPoint = new Point2d(startPoint.getxCoordinate(), startPoint.getyCoordinate());
		this.endPoint = new Point2d(endPoint.getxCoordinate(), endPoint.getyCoordinate());
		this.segmentlength = getSegmentLength();
		if (!(segmentlength > 0)) 
		{
			throw new LineSegmentLengthException("Line Segment constructor: Line cannot be created with 												zero length.");
		}		
	}

	// Methods (Observers)
	public double getSegmentLength()
	{
		// Effects: Returns the length of this.
		double startX = startPoint.getxCoordinate();
		double endX = endPoint.getxCoordinate();
		double startY = startPoint.getyCoordinate();
		double endY = endPoint.getyCoordinate();

		double length = Math.sqrt(Math.pow(startX-endX, 2) + Math.pow( startY-endY, 2));
		return length;
	}

	public Point2d getStartPoint()
	{
		// Effects: Returns the start point of this.
		Point2d start = this.startPoint;
		return start;
	}

	public Point2d getEndPoint()
	{
		// Effects: Returns the end point of this.
		Point2d end = this.endPoint;
		return end;
	}

	public boolean repOk()
	{
		// Effects: Returns false if the start point or the end point are null or the length of this is 0 else returns true.
		if (startPoint == null || endPoint == null || this.getSegmentLength() == 0)
		{
			return false;
		}
		else
		{
			return true;
		}
	}

	@Override
	public String toString() {
		return "LineSegment [startPoint=" + startPoint + ", endPoint=" + endPoint + ", segmentlength=" + segmentlength
				+ "]";
	}

}
