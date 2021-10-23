package assignment.a9_data_structures.a9_4_arrays_range;

import java.util.Scanner;

public class ArrayRange {

	static void validateRange(int[] arr, int l, int r) throws InvalidRangeException {
		if ((l < 0) || (r > (arr.length - 1))) {
			throw new InvalidRangeException("Invalid range");
		} else {
			displayRange(arr, l, r);
		}
	}

	static void displayRange(int[] arr, int l, int r) {
		System.out.println("\n****range array**** ");
		int sum = 0;
		for (int i = l; i <= r; i++) {
			System.out.print(arr[i] + " ");
			sum += arr[i];
		}
		System.out.println("\nSum= " + sum);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr = { 21, 88, 90, 43, 32 };
		try {
			int l, r;
			System.out.print("\nEnter first index: ");
			l = scanner.nextInt();
			System.out.print("\nEnter last index: ");
			r = scanner.nextInt();
			validateRange(arr, l, r);
		} catch (Exception m) {
			System.out.println("\nException occured: " + m.getMessage());
		} finally {
			scanner.close();
		}
	}

}

class InvalidRangeException extends Exception {

	InvalidRangeException(String s) {
		super(s);
	}
}