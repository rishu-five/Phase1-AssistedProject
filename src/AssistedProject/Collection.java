package AssistedProject;

import java.util.ArrayList;
import java.util.Iterator;


public class Collection {
	public static void main(String[] args) {

		// Create an ArrayList of strings

		ArrayList<String> names = new ArrayList<>();

		// Add elements to the ArrayList
		names.add("Roza");
		names.add("Krish");
		names.add("Roniee");
		names.add("Rishu");

		// Access elements by index
		System.out.println("Element at index 1: " + names.get(1));

		// Modify an element
		names.set(1, "Ramit");

		// Remove an element
		names.remove(3);

		// Iterate through the ArrayList using a for-each loop
		System.out.println("Elements in the ArrayList:");
		for (String name : names) {
			System.out.println(name);
		}

		// Iterate through the ArrayList using an iterator
		System.out.println("Elements using an Iterator:");
		Iterator<String> iterator = names.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		// Check if an element exists
		if (names.contains("Alice")) {
			System.out.println("Alice is in the ArrayList.");
		} else {
			System.out.println("Alice is not in the ArrayList.");
		}

		// Get the size of the ArrayList
		System.out.println("Size of the ArrayList: " + names.size());

	}
}
