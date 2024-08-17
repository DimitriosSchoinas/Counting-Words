import java.util.Scanner;
import java.io.*;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner input = new Scanner(System.in);
		String fileName = input.nextLine();
		Scanner in = new Scanner(new FileReader(fileName));
		CountWords words = readFrom(in);
		writeToFile(words, "output.txt");
		in.close();
	}

	private static CountWords readFrom(Scanner in) throws FileNotFoundException {

		String string;
		CountWords words = new CountWords();

		while(in.hasNextLine()) {
			string = in.nextLine().toLowerCase();
			String [] substrings = string.split(" ");
			for(int i = 0; i < substrings.length; i++)
				words.addWord(substrings[i]);
		}
		return words;
	}

	private static void writeToFile(CountWords words, String fileName) throws FileNotFoundException {

		PrintWriter out = new PrintWriter(fileName);

		Iterator it = words.iterator();
		while (it.hasNext()) {
			Word word = it.next();
			System.out.println(word.getWord() + " " + word.getNumberOfTimes());
		}
		System.out.println();
		words.sort();
		
		Iterator it2 = words.iterator();
		while(it2.hasNext()) {
			Word word = it2.next();
			System.out.println(word.getWord() + " " + word.getNumberOfTimes());
		}
	}

}
