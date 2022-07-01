package JavaBasics;

public class NameCommandLineArg {
	public static void main(String args[]) {

		System.out.println("Command-Line arguments are");

		// loop through all arguments
		for (String str : args) {
			System.out.println(str);
		}

	}

}
