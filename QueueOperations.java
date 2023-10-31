package assisted.project.rotatearray;
import java.util.*;
public class QueueOperations {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();

		// Enqueue
		queue.add(57);
		queue.add(78);
		queue.add(70);
		queue.add(90);
		queue.add(5);
		queue.add(50);

		// Display the queue elements
		System.out.println("Queue after enqueuing elements: " + queue);

		System.out.println(" ");          //To generate Extra Space on Console

		//Head of Queue
		System.out.println("Head of Queue : " + queue.peek());
		// Dequeue
		int removedElement = queue.remove();

		System.out.println(" ");          //To generate Extra Space on Console
		System.out.println("Removed element: " + removedElement);

		System.out.println(" ");          //To generate Extra Space on Console
		// Elements After Dequeue
		System.out.println("Queue after dequeuing an element: " + queue);
		
		System.out.println(" ");          //To generate Extra Space on Console
		System.out.println("Size of Queue After Deque : " + queue.size());
	}

}

