import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/*
 * Collections 9
 * Queues
 */

public class App {

	public App() {
		/*
		 * First in first out, last in last out, like a queue in real life Front is
		 * called the head and the end is called the tail Adding to the tail and
		 * removing from the head
		 */

		// ArrayBlockingQueues have a fixed size
		Queue<Integer> q1 = new ArrayBlockingQueue<Integer>(3);

		/*
		 * // LinkedList queues have a dynamic size Queue<Integer> q1 = new
		 * LinkedList<Integer>;
		 */

		// Queue Methods //

		// Adding //
		q1.add(10);
		q1.add(20);
		q1.add(30);

		try {
			q1.add(40); // Wont work as this is a queue overflow, runtime exception, caught with try
						// catch
		} catch (IllegalStateException e) {
			System.out.println("Too many items . . .");
		}

		for (Integer integer : q1) {
			System.out.println("Queue value: " + integer);
		}

		// Removing //

		Integer value = q1.remove(); // Gets the item at the head position
		System.out.println("Removed from queue: " + value);
		System.out.println("Removed from queue: " + q1.remove());
		System.out.println("Removed from queue: " + q1.remove());

		try {
			System.out.println("Removed from queue: " + q1.remove()); // Wont work because there are only three items in
																		// the queue
		} catch (IllegalStateException e) {
			System.out.println("Too many items removed . . .");
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}

		// Offering Elements //
		// The offer method returns false if it cannot add an item to the queue, good
		// way of preventing queue overflow

		Queue<Integer> q2 = new LinkedList<Integer>();

		q2.offer(10);
		q2.offer(20);
		q2.offer(30);

		// Poll //
		// Same as offer but for removing elements

		System.out.println(q2.poll());
		System.out.println(q2.poll());
		System.out.println(q2.poll());

		// Peek //
		// Just looks at the HEAD of a queue to see the top element

		q2.offer(10);
		q2.offer(20);
		q2.offer(30);

		System.out.println(q2.peek());
		System.out.println(q2.peek());
		System.out.println(q2.peek());

	}

	public static void main(String[] args) {
		new App();
	}

}
