import java.util.Scanner;

public class Main {
public static String input;

	public static void main(String[] args) {
		//creating object whose methods will be used
		WordProcessor wp1 = new WordProcessor();
		//creating scanner and outputting message to user
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a sentence.");
		
		//scanning through input and saving it to variable
		while (scan.hasNext()) {
			input = scan.nextLine();
			break;
		}
		//running methods and printing data
		wp1.setText("Null value...");
		System.out.println("The word count is " + wp1.countWords(input));
		System.out.println("The letter count is " + wp1.countLetters(input));		
		System.out.println("The sentence length is " + wp1.getLength(input));		
 


	}

}
