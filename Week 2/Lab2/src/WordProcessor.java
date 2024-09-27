//due to implementing counter interface the 3 abstract methods are used here
public class WordProcessor implements Counter{
	private int wordCount;
	private int letterCount;
	private int sentenceLength;
	private String text;
	
	//setter and getter for text attribute
	public void setText(String text) {
		this.text = text;
	}
	public String getText() {
		return text;
	}
	
	public int countWords(String sentence) {
		if (sentence != null) {
			//counts words by ignoring white space
			wordCount = sentence.split("\\s").length;
			return wordCount;
		}
		else {
			getText();
		}
		//counts words by ignoring white space
		wordCount = sentence.split("\\s").length;
		return wordCount;
	}
	 
	public int countLetters(String sentence) {
		if (sentence != null) {
			//starts at 0 and goes through variable 1 at a time
			for (int i = 0; i < sentence.length(); i++) {
				//method decides whether character is a letter and adds to variable if needed
				if ( Character.isLetter(sentence.charAt(i)) )
					letterCount++; 
				}
					return letterCount;
			}
		else {
			getText();
			return letterCount;
		}
	}
	
	public int getLength(String sentence) {
		if (sentence != null) {
			//simply gathers length of string including spaces etc and assigns to variable.
			sentenceLength = sentence.length();
			return sentenceLength;
		}
		else {
			getText();
			return sentenceLength;
			
		}
		
	} 

}
