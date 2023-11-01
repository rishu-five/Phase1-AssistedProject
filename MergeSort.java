package codes.project;

public class MergeSort {

	public void mergeSort(int[] arr) {
		if (arr == null || arr.length < 2) {
			return;
		}
		sort(arr, 0, arr.length - 1);
	}

	private void sort(int[] arr, int left, int right) {
		if (left < right) {
			int mid = (left + right) / 2;
			sort(arr, left, mid); 
			sort(arr, mid + 1, right); 
			merge(arr, left, mid, right); 
		}
	}

	private void merge(int[] arr, int left, int mid, int right) {
		int a1 = mid - left + 1;
		int a2 = right - mid;

		int[] leftArray = new int[a1];
		int[] rightArray = new int[a2];

		// Filling temp array
		for (int i = 0; i < a1; ++i) {
			leftArray[i] = arr[left + i];
		}
		for (int j = 0; j < a2; ++j) {
			rightArray[j] = arr[mid + 1 + j];
		}

		int i = 0, j = 0;
		int l = left;

		// Merging the arrays back to original array
		while (i < a1 && j < a2) {
			if (leftArray[i] <= rightArray[j]) {
				arr[l] = leftArray[i];
				i++;
			} else {
				arr[l] = rightArray[j];
				j++;
			}
			l++;
		}


		while (i < a1) {
			arr[l] = leftArray[i];
			i++;
			l++;
		}


		while (j < a2) {
			arr[l] = rightArray[j];
			j++;
			l++;
		}
	}

	public void printArray(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; ++i) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int[] arr = {12, 11, 13, 5, 6, 7};
		System.out.println("Unsorted array:");
		new MergeSort().printArray(arr);
		System.out.println();
		MergeSort sorter = new MergeSort();
		sorter.mergeSort(arr);

		System.out.println("Sorted array:");
		sorter.printArray(arr);

	}

}
