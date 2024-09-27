import java.lang.Math;

public class Ellipse extends Rectangle {
	private int area;
	private int majorAxis;
	private int minorAxis;
	
	//constructor
	Ellipse() {
	super.setSides(0);
	}
	
	//setters and getters for major axis
		public void setMajorAxis(int majorAxis) {
			this.majorAxis = majorAxis;
		}
		public int getmajorAxis() {
			return majorAxis;
		}
		
	//setters and getters for minor axis
		public void setMinorAxis(int minorAxis) {
			this.minorAxis = minorAxis;
		}
		public int getMinorAxis() {
			return minorAxis;
		}
		
		//get area method
		public int getArea() {
			area = (int) (Math.PI * Math.multiplyFull(majorAxis, minorAxis));
			return area;
		}
		//method to print data easily
		public String toString() {
			return "Sides " + super.getSides() + " major axis " + majorAxis + " minor axis " + minorAxis + " area " + getArea();

		}
}