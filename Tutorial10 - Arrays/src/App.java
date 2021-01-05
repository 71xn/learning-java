
// Tutorial 10
// Single Dimensional Arrays

public class App {
	public static void main(String[] args) {
		
		int value = 7; // This stores a single value
		// This is a value type
		
		int[] values; // This is an array witch is a list of integers, or more specifically, a list of pointers to integers in memory
		// This is a reference type
		
		values = new int[3]; // this is allocating memory space for the reference of the integer array values.
		
		values[0] = 10;
		values[1] = 20;
		values[2] = 30;
		
		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
		}
		
		int[] numbers = {5,6,7}; // Here we are declaring an array with integer values
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
	}
}
