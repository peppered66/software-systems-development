/**
 * Class used to gather length of an array
 * 
 * author peppered
 */
public class ArrayProcessor {

	/** 
	 * Gathers length of array
	 * 
	 * @param a the array that is used
	 * @return length of array
	 */
	int getArrayLength(Object[] a) {
		int count = 0;
		//loop that goes through array and counts each iteration
		try {
			for (int i = 0; i < a.length; i++) {
				count++;
			}
		} catch (Exception e) {
			System.out.println("Unable to find length.");
		}
		return count;
	}

}
