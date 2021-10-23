package assignment.a9_data_structures.a9_searchtechnique;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {

		int n = 5;
		int[] arr = new int[5];
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.print("Enter " + n + " array elements:\n");
			for (int i = 0; i < n; i++) {
				arr[i] = scanner.nextInt();
			}

			System.out.print("\nEnter element to search in array : ");
			int s = scanner.nextInt();
			int position = linearAlgo(arr, s);
			System.out.print("\nEnter element is in index " + position);
		} catch (Exception m) {
			System.out.println("\nException occured: " + m.getMessage());
		} finally {
			scanner.close();
		}

	}

	public static int linearAlgo(int arr[], int x) throws ArrayElemtNotFoundException {

		for (int i = 0; i < arr.length - 1; i++) {

			if (arr[i] == x) {
				return i;
			}
		}
		throw new ArrayElemtNotFoundException("Element not found");

	}
}

class ArrayElemtNotFoundException extends Exception {

	ArrayElemtNotFoundException(String s) {
		super(s);
	}
}