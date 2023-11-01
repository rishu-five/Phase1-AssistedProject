package codes.project;
import java.util.Arrays;
import java.util.Scanner;
public class LinearSearch {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,10,34};
		Arrays.sort(arr);
		System.out.println("The Sorted Array is :\n");
		for(int i:arr) {
			System.out.print(i+"   ");
		}
		System.out.print("\n");
		System.out.print("\n");

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter The Key Value To Search: ");
		int key_value =sc.nextInt();
		int flag=0;
		int i=0;
		for(i=0;i<arr.length;i++) {
			if(arr[i]==key_value) {
				flag=1;
				break;
			}
			else {
				flag=0;
			}


		}
		if(flag==1) {
			System.out.println( +key_value +"   is found at index "+i);
		}
		else {
			System.out.println(key_value +"  Element is not found ");
		}
	}


}

