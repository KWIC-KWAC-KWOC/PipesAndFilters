import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Alphabetizer {

	public Alphabetizer() {

	}

	public void sortAlpha(ArrayList<String> output) {
		Collections.sort(output, new Comparator<String>() {
			public int compare(String f1, String f2) {
				f1 = f1.toLowerCase();
				f2 = f2.toLowerCase();
				return f1.toString().compareTo(f2.toString());
			}
		});

		new SortedAndShiftedSentences(output);
	}
}
