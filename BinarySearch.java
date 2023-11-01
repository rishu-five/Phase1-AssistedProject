package codes.project;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		
		
		int a[]=new int[] {6,5,116,2,1,77,78,12}; //Unsorted Array
		Arrays.sort(a);
		Scanner sc=new Scanner(System.in);
		System.out.println("The sorted array is ");
		for(int i:a) {
			System.out.print(i+"   ");
		}
		System.out.println();
		System.out.println("Enter the key vlaue to search");
		int key_value=sc.nextInt();
		int flag=0;
		int low=0;
		int high=a.length-1;
		int mid=0;
		while(low<=high) {
			mid=(low+high)/2;
			if(a[mid]==key_value) {
				flag=1;
				break;
			}
			else if(a[mid]<key_value){
				low=mid+1;
			}
			else {
				high=mid-1;
			}
		}

		if(flag==1) {
			System.out.println(key_value+"  is found at index "+mid);
		}
		else {
			System.out.println(key_value +"  Element is not found ");
		}


	}

}
