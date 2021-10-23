package assignment.a9_data_structures.a9_3_arrays;

public class ArrayRotation {
	public static void display(int[] array) {
		System.out.println("****array**** ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("************* ");
	}

	public static void main(String[] args) {
		int[] arr = { 21, 88, 90, 43, 32 };
		int numberOfRotation = 3;
		display(arr);

		System.out.println("Rotate the array by " + numberOfRotation + " times toward right ");
		for (int rotationIndex = 0; rotationIndex < numberOfRotation; rotationIndex++) {
			int lastNode = arr[arr.length - 1];
			for (int arrayIndex = (arr.length - 1); arrayIndex > 0; arrayIndex--) {

				arr[arrayIndex] = arr[arrayIndex - 1];
			}
			arr[0] = lastNode;
			display(arr);
		}
	
	}

}
