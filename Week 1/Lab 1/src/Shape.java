abstract class Shape {
	//attributes
	private int sides;
	
	//constructor method
	Shape(int sides) {
		this.sides = sides;
	}
	
	//controlled access to attributes
	public int getSides() {
		return sides;
	}
	public void setSides(int sides) {
		this.sides = sides;
	}
	
	//abstract method that's forced to be on subclasses
	abstract public int getArea();
	
	//abstract method enforced on subclasses
	abstract public String toString();
	
}