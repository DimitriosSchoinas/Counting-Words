
public class Iterator {
	
	private Word[] words;
	private int size;
	private int nextIndex;

	public Iterator(Word[] words, int size) {
		this.size = size;
		this.words = words;
		nextIndex = 0;
	}
	
	public boolean hasNext() {
		return size > nextIndex;
	}

	public Word next() {
		return words[nextIndex++];
	}

	

	
}
