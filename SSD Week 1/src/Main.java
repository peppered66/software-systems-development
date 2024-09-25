
public class Main {

	public static void main(String[] args) {
		//creating rectangle objects
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle();
		Rectangle r3 = new Rectangle();
		
		//setting data for objects and printing data
		r1.setHeight(10);
		r1.setWidth(15);
		System.out.println(r1.getArea());
		System.out.println(r1.getSides());
		
		r2.setHeight(5);
		r2.setWidth(20);
		System.out.println(r2.getArea());
		System.out.println(r1.getSides());

		r3.setHeight(15);
		r3.setWidth(20);
		System.out.println(r3.getArea());
		System.out.println(r1.getSides());
		
		//creating circle objects
		Circle c1 = new Circle(90);
		Circle c2 = new Circle(20);
		Circle c3 = new Circle(24);

		//printing data
		System.out.println(c1.getSides());
		System.out.println(c1.getArea());
		
		System.out.println(c2.getSides());
		System.out.println(c2.getArea());
		
		System.out.println(c3.getSides());
		System.out.println(c3.getArea());
		
		
	}

}
