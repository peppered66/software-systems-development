import java.lang.Math;

public class Circle extends Shape{
	//attributes
	private int diameter;
	private int radius;
	private int area;
	//constructor initialising diameter and radius
	Circle(int diameter) {
		super(1);
		radius = diameter /2;
	}
	
	//setters and getters for radius
		public void setRadius() {
			this.radius = diameter / 2;
		}
		public int getRadius() {
			return radius;
		}


	//get area method inherited from shape class
	public int getArea() {
		//using math library for pi and typecasting for expression to work
		area = (int) (Math.PI * Math.pow(radius, 2));
		return area;

	}

}
