package codes.project;

public class QuickSort {
	int partition (int arr[], int start, int end)  
	{  
		int last_element = arr[end]; 
		int i = (start - 1);  

		for (int j = start; j <= end - 1; j++)  
		{  

			if (arr[j] < last_element)  
			{  
				i++; 
				int t = arr[i];  
				arr[i] = arr[j];  
				arr[j] = t;  
			}  
		}  
		int t = arr[i+1];  
		arr[i+1] = arr[end];  
		arr[end] = t;  
		return (i + 1);  
	}  


	void quick(int arr[], int start, int end)   
	{  
		if (start < end)  
		{  
			int p = partition(arr, start, end); 
			quick(arr, start, p - 1);  
			quick(arr, p + 1, end);  
		}  
	}  


	void printArr(int arr[], int n)  
	{  
		int i;  
		for (i = 0; i < n; i++)  
			System.out.print(arr[i] + " ");  
	}  



	public static void main(String[] args) {

		int arr[] = { 13, 18, 27, 2, 19, 25 };  
		int arr_len = arr.length;  
		System.out.println("Unsorted Array :\n "); 
		
		QuickSort q1 = new QuickSort();  
		q1.printArr(arr, arr_len);  
		q1.quick(arr, 0, arr_len - 1);  
		System.out.println();
		System.out.println("\nSorted Array :\n ");  
		q1.printArr(arr, arr_len);  
		System.out.println();  

	}

}
