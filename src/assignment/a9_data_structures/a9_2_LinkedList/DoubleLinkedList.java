package assignment.a9_data_structures.a9_2_LinkedList;

public class DoubleLinkedList {

	class Node {
		int data;
		Node prev;
		Node next;

		public Node(int data) {
			this.data = data;
			prev = null;
			next = null;
		}
	}

	Node head = null;
	Node tail = null;

	public void addNode(int data) {
		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
			tail.next = null;
		}
	}

	public void display(boolean headtotail) {

		if (head == null) {
			System.out.println("Empty list");
			return;
		}
		System.out.println("\ndoubly-linked-list: ");
		if (headtotail) {
			Node current = head;
			while (current != null) {
				System.out.print(current.data + " ");
				current = current.next;
			}
		} else {
			Node current = tail;
			while (current != null) {
				System.out.print(current.data + " ");
				current = current.prev;
			}
		}
	}

	public static void main(String[] args) {

		DoubleLinkedList dl = new DoubleLinkedList();
		dl.addNode(10);
		dl.addNode(5);
		dl.addNode(14);
		dl.addNode(18);
		dl.display(true);

		dl.display(false);
	}

}
