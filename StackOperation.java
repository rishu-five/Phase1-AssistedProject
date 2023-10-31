package assisted.project.rotatearray;
import java.util.Stack;

public class StackOperation {

	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<>();

		// Pushing Elements To Stack

		int s = stack.push(56);
		System.out.println("Elements Pushed To Stack : " + s);
		int s1=stack.push(63);
		System.out.println("Elements Pushed To Stack : " + s1);
		int s2=stack.push(49);
		System.out.println("Elements Pushed To Stack : " + s2);
		int s3=stack.push(37);
		System.out.println("Elements Pushed To Stack : " + s3);
		int s4=stack.push(36);
		System.out.println("Elements Pushed To Stack : " + s4);
		int s5=stack.push(66);
		System.out.println("Elements Pushed To Stack : " + s5);



		System.out.println(" ");          //To generate Extra Space on Console
		// Stack
		System.out.println("Elements Pushed To Stack : " +"\n"+ stack);

		System.out.println(" ");      //To generate Extra Space on Console


		//After Popping
		int poppedElement = stack.pop();
		System.out.println("Element Popped : " + poppedElement);

		System.out.println("New Stack : " + stack);
		//To generate Extra Space on Console
		System.out.println(" ");

		int poppedElement1 = stack.pop();
		System.out.println("Element Popped : " + poppedElement1);

		System.out.println("New Stack : " + stack);

	}

}


