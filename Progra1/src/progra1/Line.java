package progra1;

public class Line {
	private Point pointStart;
	private Point pointEnd;
        
	public Line() {
		
	}

	public Line(Point pointStart,Point pointEnd) {
		this.pointEnd = new Point();
		this.pointStart = new Point();
	}

	public Point getPointStart() {
		return pointStart;
	}

	public void setPointStart(Point point) {
		this.pointStart = new Point();
	}

	public Point getPointEnd() {
		return pointEnd;
	}

	public void setPointEnd(Point point) {
		this.pointEnd = new Point();
	}

	@Override
	public String toString() {
		return "Line [point start=" + pointStart + ", point end=" + pointEnd + "]";
	}

}
