import java.util.ArrayList;

//pipe
public class InputData {

	private ArrayList<String> listOfIgnoredWord;
	private ArrayList<String> listOfLines;

	public InputData() {

	}

	public InputData(ArrayList<String> listOfIgnoredWord, ArrayList<String> listOfLines) {
		setWordsToIgnored(listOfIgnoredWord, listOfLines);
		runCircularShift();
	}

	public void setWordsToIgnored(ArrayList<String> listOfIgnoredWord, ArrayList<String> listOfLines) {
		this.listOfIgnoredWord = listOfIgnoredWord;
		this.listOfLines = listOfLines;
	}

	public void runCircularShift() {
		CircularShift circularShift = new CircularShift();
		circularShift.circularShift(listOfIgnoredWord, listOfLines);
	}
}
