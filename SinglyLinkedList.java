package assisted.project.rotatearray;
class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
		this.next = null;
	}
}

public class SinglyLinkedList {
	Node head;

	public void deleteFirstOccurrence(int key) {
		Node current = head;
		Node prev = null;

		if (current != null && current.data == key) {
			head = current.next;
			return;
		}

		while (current != null && current.data != key) {
			prev = current;
			current = current.next;
		}

		if (current == null) {
			System.out.println("Key not found in the list.");
			return;
		}

		prev.next = current.next;
	}

	public void displayList() {
		Node current = head;
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
	}



	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();
		list.head = new Node(10);
		list.head.next = new Node(20);
		list.head.next.next = new Node(30);
		list.head.next.next.next = new Node(40);
		list.head.next.next.next.next = new Node(50);
		list.head.next.next.next.next.next = new Node(60);
		list.head.next.next.next.next.next.next = new Node(70);

		System.out.println("Original List: ");
		list.displayList();

		int keyToDelete = 30;
		list.deleteFirstOccurrence(keyToDelete);
		System.out.println("\nList after deleting the first occurrence of " + keyToDelete + ":");
		list.displayList();
		int keyToDelete1 = 40;
		list.deleteFirstOccurrence(keyToDelete1);



		System.out.println("\nList after deleting the first occurrence of " + keyToDelete1 + ":");
		list.displayList();

		int keyToDelete11 = 90;
		list.deleteFirstOccurrence(keyToDelete11);
		list.displayList();




	}

}
