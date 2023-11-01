package codes.project;
import java.util.Arrays;
import java.util.Scanner;
public class ExponentialSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {6,12,18,24,32};

		int length= arr.length;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Key Value To Search :");

		int key_value = sc.nextInt();
		int outcome = exponentialSearch(arr,length,key_value);

		if(outcome<0){

			System.out.println(key_value +  "   is not present in the array");

		}else {

			System.out.println(key_value+ "  is  present in the array at index :"+outcome);
		}

	}

	public static int exponentialSearch(int[] arr ,int length, int key_value ){

		if(arr[0]==key_value){
			return 0;
		}
		int i=1;
		while(i<length && arr[i]<=key_value){

			i=i*2;
		}
		return Arrays.binarySearch(arr,i/2,Math.min(i,length),key_value);
	}



}


