package assisted.project.rotatearray;
import java.util.Arrays;
public class ArraySmallest {

	public static void main(String[] args) {
		int[] unsortedList = {18, 65, 79, 23, 49, 32, 11, 66}; 

		int fourthSmallest = findFourthSmallest(unsortedList);

		System.out.println("The fourth smallest element in the list is: " + "\n"+fourthSmallest);
	}

	public static int findFourthSmallest(int[] arr) {
		if (arr.length < 4) {
			System.out.println("Array is too small!");
			return -1; 
		}

		Arrays.sort(arr); 
		return arr[3];


	}

}
