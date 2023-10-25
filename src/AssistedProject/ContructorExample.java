package AssistedProject;

import java.lang.reflect.Constructor;

public class ContructorExample {
	 private int value;

	    // No-argument constructor
	    public void ConstructorExample() {
	        System.out.println("No-argument constructor called.");
	        this.value = 0;
	    }

	    // Constructor with parameters
	    public void ConstructorExample(int value) {
	        System.out.println("Parameterized constructor called with value: " + value);
	        this.value = value;
	    }

	    // Constructor overloading
	    public void ConstructorExample(String message) {
	        System.out.println("String constructor called with message: " + message);
	        this.value = 0;
	    }

	    // Getter method
	    public int getValue() {
	        return value;}
	public static void main(String[] args) {
		// Create objects using different constructors
        ConstructorExample obj1 = new ConstructorExample();
        ConstructorExample obj2 = new ConstructorExample(42);
        ConstructorExample obj3 = new ConstructorExample("Hello, World!");

        // Access and print values
        System.out.println("Value of obj1: " + obj1.getValue());
        System.out.println("Value of obj2: " + obj2.getValue());
        System.out.println("Value of obj3: " + obj3.getValue());
	}

}
