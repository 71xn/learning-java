
// Tutorial 11
// Arrays of Strings
// Values and References

public class App {
	public static void main(String[] args) {
		
		// Arrays of strings are basically identical to arrays of integers
		
		String[] words = new String[3];
		
		words[0] = "Hello";
		words[1] = "to";
		words[2] = "you";
		
		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
		}
		
		String[] fruits = {"apple", "banana", "pear", "kiwi"};
		
		// This is an enhanced for loop
		for (String fruit : fruits) {
			System.out.println(fruit);
		}
		
		String text = null; // Value type
		
		System.out.println(text);
		
		String[] texts = new String[2]; // Reference type
		
		System.out.println(texts[0]);
		
		texts[0] = "one"; // Reference type
		
	}
}
