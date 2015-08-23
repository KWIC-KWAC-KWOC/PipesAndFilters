import java.util.ArrayList;
import java.util.Scanner;

public class Input {
	private Scanner sc;

	public Input() {

	}

	public void run() {
		ArrayList<String> listOfLines = new ArrayList<String>();
		ArrayList<String> listOfIgnoredWord = new ArrayList<String>();
		
		System.out.printf("Enter the title:" + "\n" + "(click enter twice to exit) " + "\n");
		sc = new Scanner(System.in);	
		takeInInputs(listOfLines);
		
		System.out.printf("Enter the word to be ignored: " + "\n" + "(click enter twice to exit)" + "\n");
		takeInInputs(listOfIgnoredWord);
		
		CircularShift circularShift = new CircularShift();
		circularShift.shift(listOfIgnoredWord, listOfLines);
	}

	private void takeInInputs(ArrayList<String> listOfLines) {
		while (true) {
			String lines = sc.nextLine();
			
			if (lines.equals("") || lines.equals("exit")) {
				break;
			}
			
			listOfLines.add(lines);		
		}
	}

}
