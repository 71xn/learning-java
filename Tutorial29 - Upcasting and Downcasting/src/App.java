
// Tutorial 29 
// Upcasting and Downcasting

class Machine {
	public void start() {
		System.out.println("Machine Started");
	}
}

class Camera extends Machine {
	@Override
	public void start() {
		System.out.println("Camera Started");
	}
	
	public void snap() {
		System.out.println("Photo Taken");
	}
}

public class App {
	public static void main(String[] args) {
		
		Machine mach1 = new Machine();
		Camera cam1 = new Camera();
		
		mach1.start();
		cam1.start();
		
		// Upcasting
		Machine mach2 = cam1; // Made variable of machine type refer to an object of a subclass, so we are upcasting
		mach2.start(); // This refers to a camera object so we will run the camera's start method
		// mach2.snap();, This doesn't work because the Machine class does not have a snap method
		
		// Downcasting - Very Unsafe
		Machine mach3 = new Camera(); // Creating a machine object using the camera class 
		Camera cam2  = (Camera) mach3; // Downcasting the machine object to a camera object
		cam2.start();
		cam2.snap();
		
		
		// Won't work because the initial object was created using the Machine class rather then the camera class.
		/*
		 * Machine mach4 = new Machine(); 
		 * Camera cam3  = (Camera) mach3; 
		 * cam3.start();
		 * cam3.snap();
		 */
		
		
	}
}
