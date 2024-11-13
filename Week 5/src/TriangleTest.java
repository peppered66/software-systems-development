import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TriangleTest {

	@Test
	void testisIsosceles() {

		Triangle tri = new Triangle(2, 2, 3);
		Triangle tri2 = new Triangle(2, 4, 3);
		assertTrue(tri.isIsosceles());
		assertFalse(tri2.isIsosceles());

	}

	@Test
	void testisEquilateral() {
		Triangle tri = new Triangle(4, 4, 4);
		Triangle tri2 = new Triangle(4, 3, 4);
		assertTrue(tri.isEquilateral());
		assertFalse(tri2.isEquilateral());
	}

	@Test
	void testisScalene() {
		Triangle tri = new Triangle(4, 4, 4);
		Triangle tri2 = new Triangle(2, 3, 4);
		assertFalse(tri.isScalene());
		assertTrue(tri2.isScalene());

	}

	@Test
	void testSetSides() {
		Triangle tri = new Triangle();
		tri.setSides(4, 3, 1);
		assertFalse(tri.isEquilateral());
		assertFalse(tri.isIsosceles());
		assertTrue(tri.isScalene());

		tri.setSides(4, 2);
		assertTrue(tri.isIsosceles());
		assertFalse(tri.isEquilateral());
		assertFalse(tri.isScalene());

		tri.setSides(5);
		assertTrue(tri.isEquilateral());
		assertFalse(tri.isIsosceles());
		assertFalse(tri.isScalene());

	}

	@Test
	void testCopy() {
		Triangle tri = new Triangle(4);
		Triangle tri2 = tri.copy();

		assertTrue(tri.isEquilateral());
		assertTrue(tri2.isEquilateral());

		tri2.setSides(5, 5, 3);
		assertTrue(tri2.isIsosceles());
		assertFalse(tri.isIsosceles());

	}
	
	@Test
	void testgetPerimeter() {
		Triangle tri = new Triangle(5);
		assertEquals(15, tri.getPerimeter());
		
		Triangle tri2 = new Triangle(2,4,6);
		assertEquals(12, tri2.getPerimeter());
		
		Triangle tri3 = new Triangle();
		assertEquals(3, tri3.getPerimeter());
		
		
	}
	
	@Test
	void testgetAverageLength() {
		Triangle tri = new Triangle(5);
		assertEquals(5,tri.getAverageLength());
	}
	
	@Test
	void testDefaultConstructor() {
		Triangle tri = new Triangle();
		assertTrue(tri.isEquilateral());
		assertFalse(tri.isIsosceles());
		assertFalse(tri.isScalene());
	}
	
	@Test
	void testEquilateralConstructor() {
		Triangle tri = new Triangle(5);
		assertTrue(tri.isEquilateral());
		assertFalse(tri.isIsosceles());
		assertFalse(tri.isScalene());
	}
	
	@Test
	void testIsoscelesConstructor() {
		Triangle tri = new Triangle(5,3, 4);
		assertTrue(tri.isScalene());
		assertFalse(tri.isEquilateral());
		assertFalse(tri.isIsosceles());
		
	}

	/*
	 * @Test void test() { fail("Not yet implemented"); }
	 */
}
