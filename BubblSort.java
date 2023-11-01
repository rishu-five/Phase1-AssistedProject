package codes.project;

public class BubblSort {

	public static void bubbleSort(int[] arr) {


		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {

					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	public static void printArray(int[] arr) {
		int array_len = arr.length;
		for (int i = 0; i < array_len; ++i) {
			System.out.print(arr[i] + " ");
		}
		System.out.println(" \n");
	}

	public static void main(String[] args) {
		

		int[] arr = {35, 37, 36, 43, 1, 34, 104};
		System.out.println("Unsorted array:");
		printArray(arr);

		bubbleSort(arr);

		System.out.println("Sorted array:");
		printArray(arr);
	}

}


