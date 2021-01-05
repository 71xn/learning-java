import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * Collections 2
 * LinkedList
 */

// A LinkedList is a data structure that is more efficient then an ArrayList at adding and removing items from any point in the list, as it is just a list of memory pointers


public class App {

	public App() {
		
		/*
		 * ArrayLists manage arrays internally.
		 * [0][1][2][3][4][5] . . . 
		 * Adding items to the end is fast because java knows where the end is
		 * Adding items to the middle or start is hard because all the items have to be shifted 
		 */
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		/*
		 * LinkedLists consists of elements where each element has a reference to the previous and next elements
		 * [0] --> [1] --> [2] . . .
		 * Adding items to the middle or start is easy and fast because all you have to do is change the pointers of previous and next items
		 */
		
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		
		/*
		 * This also works
		 * List<Integer> arrayList = new ArrayList<Integer>();
		 * List<Integer> linkedList = new LinkedList<Integer>();
		 */
		
		System.out.println("Adding items at the end of a list . . .");
		doTimingsEnd("ArrayList", arrayList);
		doTimingsEnd("LinkedList", linkedList);
		
		System.out.println("Adding items at the start of a list . . .");
		doTimingsStart("ArrayList", arrayList);
		doTimingsStart("LinkedList", linkedList);
		
	}
	
	// List allows us to pass any type of list
	public void doTimingsEnd(String type, List<Integer> list) {
		for (int i = 0; i < 1E5; i++) {
			list.add(i);
		}
		
		long start = System.currentTimeMillis();
		
		// Add items at the end of the list
		for (int i = 0; i < 1E5; i++) {
			list.add(i);
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println("Time taken for: " + type + ", was: " + (end-start) + "ms");
	}
	
	public void doTimingsStart(String type, List<Integer> list) {
		for (int i = 0; i < 1E5; i++) {
			list.add(i);
		}
		
		long start = System.currentTimeMillis();
		
		// Add items at the start of the list
		for (int i = 0; i < 1E5; i++) {
			list.add(0, i);
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println("Time taken for: " + type + ", was: " + (end-start) + "ms");
	}

	public static void main(String[] args) {
		new App();
	}

}
