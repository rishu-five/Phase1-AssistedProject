package AssistedProject;

public class StringConversion {
	public static void main(String[] args) {

		//Creation of a string


		String str="String Demo";

		//Conversion of string to stringBuffer


		StringBuffer buffer=new StringBuffer(str);
		buffer.append("String Buffer Demo");
		System.out.println("Using String Buffer: "+buffer);

		//conversion of string to stringBuilder


		StringBuilder builder=new StringBuilder(str);
		builder.append("String Builder Demo");
		System.out.println("Using String Builder: "+builder);

		//Original String


		System.out.println("Original String: "+str);

	}

}
