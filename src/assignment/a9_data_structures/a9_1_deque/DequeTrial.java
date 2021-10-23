package assignment.a9_data_structures.a9_1_deque;

import java.util.ArrayList;
import java.util.List;

public class DequeTrial {

	public DequeTrial() {
		// TODO Auto-generated constructor stub
	}

	private List<Integer> deque = new ArrayList<Integer>();

	public void insertFront(int item) {
		System.out.println("Adding To front of Deque: " + item);
		deque.add(0, item);
		printDeque();
	}

	public void printDeque() {
		System.out.println("****deque****");
		System.out.println(deque);
		System.out.println("*************");
	}

	public void insertRear(int item) {
		System.out.println("Adding To rear of Deque: " + item);
		deque.add(item);
		printDeque();
	}

	public void removeFront() {
		if (deque.isEmpty()) {
			System.out.println("Deque empty.");
			return;
		}
		int rem = deque.remove(0);
		System.out.println("removed from front: " + rem);
		printDeque();
	}

	public void removeRear() {
		if (deque.isEmpty()) {
			System.out.println("Deque empty.");
			return;
		}
		int rem = deque.remove(deque.size() - 1);
		System.out.println("removed from rear: " + rem);
		printDeque();
	}

	public int peakFront() {
		// gets the element from the front without removing it
		int item = deque.get(0);
		System.out.println("peakFront: " + item);
		return item;
	}

	public int peakRear() {
		// gets the element from the rear without removing it
		int item = deque.get(deque.size() - 1);
		System.out.println("peakRear: " + item);
		return item;
	}

	public static void main(String a[]) {

		DequeTrial deq = new DequeTrial();

		deq.insertFront(90);
		deq.insertRear(56);
		deq.insertRear(33);
		deq.insertFront(12);
		
		deq.peakFront();
		deq.peakRear();
		
		deq.removeFront();
		deq.peakFront();
		
		deq.removeRear();	
		deq.peakFront();
		
		deq.insertFront(44);
		deq.insertFront(88);
		

	}

}
