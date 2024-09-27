
public class WordProcessor implements Counter{

	public int wordCount;
	public int letterCount = 0;
	public int sentenceLength;
	
	
	public int countWords(String sentence) {
		//counts words by ignoring white space
		wordCount = sentence.split("\\s").length;
		return wordCount;
	}
	
	public int countLetters(String sentence) {
		//starts at 0 and goes through variable 1 at a time
		for (int i = 0; i < sentence.length(); i++) {
		//method decides whether character is a letter and adds to variable if needed
		if ( Character.isLetter(sentence.charAt(i)) )
			letterCount++; 
		}
		//returns letter count
		return letterCount;
	}

	public int getLength(String sentence) {
		//simply gathers length of string including spaces etc and assigns to variable.
		sentenceLength = sentence.length();
		return sentenceLength;
	}

}
