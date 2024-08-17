
public class Word {

	private String word;
	private int numberOfTimes;
	
	public Word(String word) {
		this.word = word;
		numberOfTimes = 1;
	}
	public void increase() {
		numberOfTimes++;
	}
	public String getWord() {
		return word;
	}
	public int getNumberOfTimes() {
		return numberOfTimes;
	}
	public int compareTo(Word other) {
		
		int result = numberOfTimes - other.getNumberOfTimes();
		if(result != 0)
		return result;
		else {
			result = other.getWord().compareTo(word);
			return result;
		}
	}
}
