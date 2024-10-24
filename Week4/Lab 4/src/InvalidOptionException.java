/**
 * Exception used to report invalid menu choice
 * 
 * author peppered
 * 
 */
@SuppressWarnings("serial")
public class InvalidOptionException extends Exception {

	/**
	 * constructor allowing message to be passed when implemented
	 * 
	 * @param message the exception message
	 */
	public InvalidOptionException(String message) {
		super(message);
	}

}
