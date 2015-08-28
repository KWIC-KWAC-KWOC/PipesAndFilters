import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author WeiLin
 *
 */
public class KWICKWACKWOC {

	private static Scanner sc;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		runForInput();	

	}
	
	public static void runForInput() {
		ArrayList<String> listOfLines = new ArrayList<String>();
		ArrayList<String> listOfIgnoredWord = new ArrayList<String>();
		
		System.out.printf("Enter the title:" + "\n" + "(click enter twice to exit) " + "\n");
		sc = new Scanner(System.in);	
		takeInInputs(listOfLines);
		
		System.out.printf("Enter the word to be ignored: " + "\n" + "(click enter twice to exit)" + "\n");
		takeInInputs(listOfIgnoredWord);
		
		new InputData(listOfIgnoredWord, listOfLines);
	}

	private static void takeInInputs(ArrayList<String> listOfLines) {
		while (true) {
			String lines = sc.nextLine();
			
			if (lines.equals("") || lines.equals("exit")) {
				break;
			}
			
			listOfLines.add(lines);		
		}
	}

}
