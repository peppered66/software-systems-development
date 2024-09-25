
abstract class Shape {
	
	private int sides;
	private int area;
	
	public int getSides() {
		return sides;
	}
	
	public void setSides(int sides) {
		this.sides = sides;
	}
	
	abstract public int getArea();
	
	Shape(int sides) {
		this.sides = sides;
	}

	
	
}
