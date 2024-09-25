
public class Rectangle extends Shape {
	
	private int height;
	private int width;
	private int area;
	
	Rectangle(int sides) {
		super(sides);
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
			return height;
		}

	@Override
	public int getArea() {
		return area;
	}

}
