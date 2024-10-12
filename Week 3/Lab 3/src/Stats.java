import java.util.Arrays;

/**
 * A class which calculates various statistical data from a list of numbers.
 * 
 * @author peppered66
 */
public class Stats {

	/**
	 * Array to store list of numbers
	 */
	private int[] numbers;

	/***
	 * numbers of values currently stored in list {@link #numbers}.
	 */
	private int count;

	/**
	 * this method will add values to the list
	 * 
	 * @param value the value to be added to list
	 */
	public void addValue(int value) {
		// adds the given value to the array
		numbers[count] = value;
		// increments count
		count++;
	}

	/**
	 * Gets the number of currently stored values
	 * 
	 * @return the number of values stored
	 */
	public int getCount() {
		return count;
	}

	/**
	 * this method will calculate and return the highest value
	 * 
	 * @return the largest value in list
	 */
	public int getMax() {
		int max = numbers[0]; // start with first value

		// goes through list and finds highest value
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > max)
				max = numbers[i];
		}

		return max;
	}

	/**
	 * this method will calculate and return the lowest value
	 * 
	 * @return the lowest value in list
	 */
	public int getMinimum() {
		int min = numbers[0]; // start with first value

		// goes through list and finds lowest value
		for (int i = 1; i < numbers.length; i++) {

			if (numbers[i] < min)
				min = numbers[i];
		}

		return min;
	}

	/**
	 * this method will add all values to get total value and return this total s
	 * 
	 * @return the sum of all values in list
	 */
	public int getTotal() {

		int total = 0; // start with 0

		// calculates total of all values within the list
		for (int i = 0; i < numbers.length; i++) {
			total += numbers[i];
		}
		return total;
	}

	/**
	 * this method calculates the average from the values and returns the value
	 * 
	 * @return the average value of the list
	 */
	public double getAverage() {
		int x = 0;
		// adds all values in array together
		for (int i = 0; i < numbers.length; i++) {
			x += numbers[i];
		}
		// divides total value by number of values present in list to get the average
		double y = x / (double) numbers.length;

		return y;
	}
	@Override
	public String toString() {
		return Arrays.toString(numbers);
	}

	/**
	 * constructor
	 * 
	 * @param capacity the capacity of max values in list allowed
	 */
	public Stats(int capacity) {
		numbers = new int[capacity];
	}

}