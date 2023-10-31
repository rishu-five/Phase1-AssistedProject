package assisted.project.rotatearray;

public class RangeQeries {

	public static void main(String[] args) {
		int no_of_element = 6; 
		int Lower_bound = 2; 
		int Upper_bound = 4; 

		int[] array = { 3, 7, 2, 5, 8, 9 };  

		if (0 <= Lower_bound && Lower_bound <= Upper_bound && Upper_bound < no_of_element - 1) {
			int sum = calculateRangeSum(array, Lower_bound, Upper_bound);
			System.out.println("Sum of the elements from the index " + Lower_bound + " to " + Upper_bound + ": " + sum);
		} else {
			System.out.println("ArraySize Not Valid!");
		}
	}

	public static int calculateRangeSum(int[] arr, int Lower_bound, int Upper_bound) {
		int sum = 0;
		for (int i = Lower_bound; i <= Upper_bound; i++) {
			sum += arr[i];
		}
		return sum;

	}

}
