
public class Rectangle extends Shape {
	//attributes
	private int height;
	private int width;
	private int area;
	
	//constructor
	Rectangle() {
		super(4);
	}
	
	//setters and getters for height
	public void setHeight(int height) {
		this.height = height;
	}
	public int getHeight() {
		return height;
	}
	
	//setters and getters for width
	public void setWidth(int width) {
		this.width = width;
	}
	public int getWidth() {
		return width;
	}
	//get area method inherited from shape class
	public int getArea() {
		this.area = height * width;
		return area;
	}
	
	//method to print data easily
	public String toString() {
		return "Sides " + super.getSides() + " height " + height + " width " + width + " area " + getArea();
	}

}
