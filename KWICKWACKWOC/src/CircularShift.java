import java.util.ArrayList;

public class CircularShift {
	ArrayList<String> output = new ArrayList<String>();

	public CircularShift() {

	}

	public void shift(ArrayList<String> wordsToBeIgnored, ArrayList<String> listOfLines) {
	
		for (int i = 0; i < listOfLines.size(); i++) {
			String title = listOfLines.get(i);
			title = title.trim();
			title = title.replaceAll("\\s+", " ");
			String[] wordsInTitle = title.split("\\s+");

			for (int j = 0; j < wordsInTitle.length; j++) {
				if (!checkForIgnoredWord(wordsToBeIgnored, wordsInTitle[j])) {
					title = title.replaceFirst(wordsInTitle[j] + " ", "");
					title = wordsInTitle[j].toUpperCase() + " " + title;
					output.add(title);
					title = title.replaceFirst(wordsInTitle[j].toUpperCase() + " ", "");
					title = title + " " + wordsInTitle[j];
				} else {
					title = title.replaceFirst(wordsInTitle[j] + " ", "");
					title = title + " " + wordsInTitle[j].toLowerCase();
				}
			}

		}
		Alphabetizer sort = new Alphabetizer();
		sort.sortAlpha(output);
	}

	private boolean checkForIgnoredWord(ArrayList<String> wordsToBeIgnored, String wordsInTitle) {
		wordsInTitle = wordsInTitle.toLowerCase();
		for (int i = 0; i < wordsToBeIgnored.size(); i++) {
			wordsToBeIgnored.set(i,wordsToBeIgnored.get(i).trim());
			if (wordsInTitle.equals(wordsToBeIgnored.get(i).toLowerCase())) {
				return true;
			}
		}

		return false;
	}

}
