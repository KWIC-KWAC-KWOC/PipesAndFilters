import java.util.ArrayList;

//pipe
public class CircularShiftedTitles {

	private ArrayList<String> shiftedSentences;

	public CircularShiftedTitles() {

	}

	public CircularShiftedTitles(ArrayList<String> shiftedSentences) {
		setShiftedSentences(shiftedSentences);
		runAlphabetizer();
	}

	public void setShiftedSentences(ArrayList<String> shiftedSentences) {
		this.shiftedSentences = shiftedSentences;
	}

	public void runAlphabetizer() {
		Alphabetizer sort = new Alphabetizer();
		sort.sortAlpha(shiftedSentences);
	}
}
