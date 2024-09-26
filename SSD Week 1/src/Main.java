
public class Main {

	public static void main(String[] args) {
		//creating rectangle objects
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle();
		Rectangle r3 = new Rectangle();
		
		//setting data for objects and printing data
		r1.setHeight(10);
		r1.setWidth(15);
		System.out.println(r1.toString());
		r2.setHeight(5);
		r2.setWidth(20);
		System.out.println(r2.toString());
		r3.setHeight(15);
		r3.setWidth(20);
		System.out.println(r3.toString());

		//creating circle objects
		Circle c1 = new Circle();
		Circle c2 = new Circle();
		Circle c3 = new Circle();

		//setting and printing data
		c1.setDiameter(45);
		c1.setRadius();
		System.out.println(c1.toString());
		c2.setDiameter(50);
		c2.setRadius();
		System.out.println(c2.toString());
		c3.setDiameter(25);
		c3.setRadius();
		System.out.println(c3.toString());

		//creating ellipse objects
		Ellipse e1 = new Ellipse();
		Ellipse e2 = new Ellipse();
		Ellipse e3 = new Ellipse();
		
		//setting and printing data
		e1.setMajorAxis(5);
		e1.setMinorAxis(4);
		System.out.println(e1.toString());
		e2.setMajorAxis(6);
		e2.setMinorAxis(4);
		System.out.println(e2.toString());
		e3.setMajorAxis(3);
		e3.setMinorAxis(10);
		System.out.println(e3.toString());


		
	}

}
