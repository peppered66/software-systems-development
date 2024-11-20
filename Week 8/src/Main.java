
public class Main {

	public static void main(String[] args) {
		// Test the EmailStore
		EmailStore store = new EmailStore();

		store.addEmail("test@test.com");
		store.addEmail("test@test.com");
		store.addEmail("test2@test.com");
		store.addEmail("test3@test.com");
		store.addEmail("test4@test.com");

		store.displayEmails();

		// Test the WordCounter
		WordCounter wc = new WordCounter();
		wc.addSentence(
				"This sentence will have each word be counted, well hopefully.");

		wc.outputResults();
	}

}
