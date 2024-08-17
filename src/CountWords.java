
public class CountWords {

	private static final int DEFAULT_CAPACITY = 0;
	private static final int GROWTH_FACTOR = 1;

	private Word[] words;
	private int position;

	public CountWords() {

		words = new Word[200 * 4000];
		position = DEFAULT_CAPACITY;
	}

	public void addWord(String word) {

		if (hasWord(word))
			words[getWordIndex(word)].increase();
		else
		words[position++] = new Word(word);
	}

	private int getWordIndex(String word) {

		int index = -1;
		int i = 0;

		while (i < position && index == -1) {
			if (word.equals(words[i].getWord()))
				index = i;
			i++;
		}
		return index;
	}

	private boolean hasWord(String word) {

		if (getWordIndex(word) == -1)
			return false;
		else
			return true;
	}

	public Iterator iterator() {
		return new Iterator(words, position);
	}
	

	public void sort() {
		for (int i=0; i < position-1; i++) {
			int minIdx = i;
			for (int j=i+1; j < position; j++)
			if (words[j].compareTo(words[minIdx]) > 0)
			minIdx = j;
			Word tmp = words[i];
			words[i] = words[minIdx];
			words[minIdx] = tmp;
	}
	}
	

}
