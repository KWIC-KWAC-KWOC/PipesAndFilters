import java.util.ArrayList;

public class SortedAndShiftedSentences {
	private ArrayList<String> output;

	public SortedAndShiftedSentences() {

	}

	public SortedAndShiftedSentences(ArrayList<String> output) {
		setSentences(output);
		transferOutput();
	}

	public void setSentences(ArrayList<String> output) {
		this.output = output;
	}

	public void transferOutput() {
		Output printOutput = new Output();
		printOutput.printOut(output);
	}
}
