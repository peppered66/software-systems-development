import java.util.Random;

/**
 * a driver/main class which incorporates the {@link Stats} class.
 * 
 * @author peppered66
 */
public class Driver {
	/**
	 * Main method where program starts to execute
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Constant value which defines number of values to be added
		final int VALUES = 10;

		// creates instance of Stats class assigning the constant value as our parameter
		Stats stats = new Stats(VALUES);

		// creates instance of random class to generate values
		Random random = new Random();

		// randomly generated values are added to the list
		for (int i = 0; i < VALUES; i++) {
			stats.addValue(random.nextInt(100));
		}

		// Outputting information using the methods from stats class
		System.out.println("Numbers stored : ");
		System.out.println(stats);

		System.out.println("Average = " + stats.getAverage());
		System.out.println("Count = " + stats.getCount());
		System.out.println("Total = " + stats.getTotal());
		System.out.println("Minimum value = " + stats.getMinimum());
		System.out.println("Maximum value = " + stats.getMax());
	}
}