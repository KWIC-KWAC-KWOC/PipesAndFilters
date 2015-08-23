import java.util.ArrayList;

public class Output {
	
	public Output() {
		
	}

	public void printOut(ArrayList<String> output) {
		System.out.print("Result: " + "\n");
		
		for(int i = 0; i < output.size(); i++) {
			System.out.print(output.get(i) + "\n");
		}
	}
}
