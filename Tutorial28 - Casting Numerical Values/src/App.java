
// Tutorial 28
// Casting Numerical Values

public class App {
	
	public static void main(String[] args) {
		
		byte byteValue = 20;
		short shortValue = 55;
		int intValue = 888;
		long longValue = 23355;
		
		float floatValue = 8834.3f;
		double doubleValue = 32.4;
		
		// This is casting the long value to an integer, the type you want to cats to goes into the brackets
		intValue = (int) longValue;
		
		// We don't need a cast here as we are not changing the number essentially
		doubleValue = intValue;
		
		// We are not rounding, we are changing the number
		intValue = (int) floatValue;
		
		
		
	}
	
}
