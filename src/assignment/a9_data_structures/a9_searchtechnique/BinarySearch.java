package assignment.a9_data_structures.a9_searchtechnique;

import java.util.Scanner;

public class BinarySearch {

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
			try {
				binaryAlgo(arr, 0, arr.length - 1, s);
			} catch (Exception m) {
				System.out.println("\nException occured: " + m.getMessage());
			}
		} catch (Exception m) {
			System.out.println("\nException occured");
		} finally {
			scanner.close();
		}

	}

	public static void binaryAlgo(int arr[], int l, int r, int key) throws ArrayElemtNotFoundException {

		int mid = (l + r) / 2;
		while (l <= r) {
			if (arr[mid] < key) {
				l = mid + 1;
			} else if (arr[mid] == key) {
				System.out.print("\nEnter element is in index " + mid);
				break;
			} else {
				r = mid - 1;
			}
			mid = (l + r) / 2;
		}
		if (l > r) {
			throw new ArrayElemtNotFoundException("Element not found");
		}
		
	}

}

class ArrayElemtNotFoundException extends Exception {

	ArrayElemtNotFoundException(String s) {
		super(s);
	}
}
