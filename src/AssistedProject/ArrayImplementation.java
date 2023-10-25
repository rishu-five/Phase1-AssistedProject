package AssistedProject;

public class ArrayImplementation {

	public static void main(String[] args) {
		//Declaring and initialing an array of integers


		int num[]= {10,23,63,532,73246,56};

		//Accessing and printing elements from an array


		System.out.println("The numbers are: ");
		for(int i=0;i<num.length;i++)
		{
			System.out.print(num[i]+" ");
		}
		System.out.println();

		//Declaration and initialization of an array of String


		String stud[]= {"Raj","Ron","Ritwik","Ram","Ranjan","Rishu"};

		//Accessing and printing elements from an array


		System.out.println("The names are: ");
		for(int i=0;i<stud.length;i++)
		{
			System.out.print(stud[i]+" ");
		}
		System.out.println();

		// finding the length of the arrays


		System.out.println("The length of integer array is: "+stud.length);
		System.out.println("The length of string array is: "+stud.length);

	}

}
