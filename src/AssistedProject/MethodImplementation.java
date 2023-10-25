package AssistedProject;

public class MethodImplementation {
	 // Method with no parameters and no return value (void method)
	
	
    public void greet() {
        System.out.println("How are you");
    }
    
    // Method with parameters and a return value
    
    
    public int add(int a, int b) {
        return a + b;
    }
    
    // Static method
    
    
    public static void staticMethod() {
        System.out.println("This is a static method.");
    }
	public static void main(String[] args) {
		  MethodImplementation example = new MethodImplementation();

	        // Calling a method with no parameters and no return value
		  
		  
	        example.greet();

	        // Calling a method with parameters and return value
	        
	        
	        int sum = example.add(20, 59);
	        System.out.println("Sum: " + sum);

	        // Calling a static method 
	        
	        staticMethod();

	        // Using method chaining
	        
	        
	        int result = example.add(50, example.add(20, 59));
	        System.out.println("Chained Method Call Result: " + result);

	}

}
