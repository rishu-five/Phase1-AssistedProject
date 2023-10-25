package AssistedProject;

public class TypeCasting {

	public static void main(String[] args) {
	
		 // Implicit Type Casting
		
		
        int intNumber = 55;
        double doubleNumber = intNumber;        // Implicit typecasting from int to double

        System.out.println("Implicit TypeCasting:");
        System.out.println("intNumber: " + intNumber);
        System.out.println("doubleNumber: " + doubleNumber);
        
        
        
        // Explicit Type Casting 
        
        
        double DoubleNumber = 5.054;
        int IntNumber = (int) DoubleNumber; // Explicit typecasting from double to int

        System.out.println("\nExplicit TypeCasting:");
        System.out.println("DoubleNumber: " + DoubleNumber);
        System.out.println("IntNumber: " + IntNumber);

	}

}
