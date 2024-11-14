/**
 * A menu class which handles option selection
 * 
 * author peppered
 */
public class Menu {
	/**
	 * 
	 * Allows menu option to be chosen and reports which is chosen
	 * 
	 * @param opt the option selected
	 * @throws InvalidOptionException if option selected is out of range
	 */
	void displayMenuOption(int opt) throws InvalidOptionException {
		System.out.println("Please select a menu option(1-3).");
		if (opt < 1 || opt > 3)
			throw new InvalidOptionException("Only options 1-3 are available.");

		System.out.println("Menu option " + opt + " selected.");

	}

	{
	}
}
