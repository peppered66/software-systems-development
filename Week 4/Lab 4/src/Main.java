/**
 * main class
 * 
 * author peppered
 */
public class Main {

	public static void main(String[] args) {
		ArrayProcessor a1 = new ArrayProcessor();
		int length = a1.getArrayLength(new String[] { "one", "two", "three" });
		System.out.println("Array length is " + length);

		Menu m1 = new Menu();
		Menu m2 = new Menu();
		Menu m3 = new Menu();

		try {
			m1.displayMenuOption(1);
			m2.displayMenuOption(2);
			m3.displayMenuOption(4);

		} catch (InvalidOptionException e) {
			System.out.println(e.getMessage());
		}

	}

}
