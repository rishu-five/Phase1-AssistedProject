package AssistedProject;


public class AccessModifiers {

	//Public access modifier
	public int publicField = 95;

	// Default access modifier 
	int defaultField = 56;

	// Private access modifier
	private int privateField = 65;

	// Protected access modifier
	protected int protectedField = 73;

	public void printFields() {
		System.out.println("Public Field: " + publicField);
		System.out.println("Default Field: " + defaultField);
		System.out.println("Private Field: " + privateField);
		System.out.println("Protected Field: " + protectedField);
	}

	public static void main(String[] args) {
		AccessModifiers obj = new AccessModifiers();
		obj.printFields();
	}
	class Subclass extends AccessModifiers {
		public void accessProtectedField() {
			System.out.println("Protected Field in Subclass: " + protectedField);
		}
	}
}
