//interface which contains method headers which will be given bodies in subclasses
public interface Counter {
	//counts words in sentence
	int countWords(String sentence);
	//counts characters in sentence
	int countLetters(String sentence);
	//counts length of sentence
	int getLength(String sentence);

}
