import java.util.Iterator;

// Tutorial 20
// StringBuilder and String Formatting


public class App {
	public static void main(String[] args) {
		
		// Very inefficient, each += is just creating a new string
		String info = "";
		info += "My name is Bob."; // Not actually appending text, just creating new strings, and reassigning the info variable
		info += " ";
		info += "I am a builder.";
		System.out.println(info);
		
		// String Builder
		// Better way, more efficient / memory efficient
		StringBuilder sb = new StringBuilder("");
		
		sb.append("My name is Sue.");
		sb.append(" ");
		sb.append("I am a lion tamer.");
		
		// Converts the string builder object to a string
		System.out.println(sb.toString());
		
		StringBuilder s = new StringBuilder();
		// Method chaining
		s.append("My name is Roger.")
		.append(" ")
		.append("I am a skydiver.");
		
		System.out.println(s.toString());
		
		// String Buffer, allows for threading safe access of string objects
		StringBuffer sbb = new StringBuffer("");
		sbb.append("Buffer ").append("Test, ").append("It works!");
		System.out.println(sbb.toString());
		
		
		// String Formatting
		
		System.out.print("Here is a some text. \t That was a tab.\nThat was a new line\n"); // Print doesn't output a new line, after the text
		System.out.println("More text"); // println does output a newline after the text
		
		System.out.printf("Total: %-10d; quantity is %d\n", 5, 120);
		// %d, integers
		
		for (int i = 0; i < 20; i++) {
			System.out.printf("%-2d: some text here\n", i); // 2d means a width of 2, so that text is all nicely aligned
		}
		
		// Formatting floating point
		System.out.printf("Total value: %.1f\n", 5.6874);
		System.out.printf("Total value: %6.1f\n", 343.23423); // the 6 means that before the decimal place it can take up to 6 spaces, and the one after the decimal point means that only one decimal value will be shown.
		
		
	}
}
