package assisted.project.rotatearray;

public class RotateArray {

	public static void main(String[] args) {
		int[] originalArray = {14, 32, 37, 41, 59, 65, 67, 89, 97, 16};

		int steps = 5; 

		System.out.println("Original Array:");
		printArray(originalArray);

		rightRotate(originalArray, steps);

		System.out.println("\nArray after right rotation by 5 steps:");
		printArray(originalArray);
	}

	public static void rightRotate(int[] arr, int steps) {
		int length = arr.length;
		steps = steps % length; 
		reverseArray(arr, 0, length - 1);
		reverseArray(arr, 0, steps - 1);
		reverseArray(arr, steps, length - 1);
	}

	public static void reverseArray(int[] arr, int start, int end) {
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

	public static void printArray(int[] arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();


	}

}
