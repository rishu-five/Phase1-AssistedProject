package AssistedProject;

public class OuterClass {int outerdata=560000;

//non-static Inner class
class Inner
{
	void showInner()
	{
		System.out.println("InnerClass: "+outerdata);
	}
}

//Static inner class
static class StaticInner
{
	void showstaticInner()
	{
		System.out.println("StaticInner: "+new OuterClass().outerdata);
	}
	
}
	public static void main(String[] args) {
OuterClass out_class=new OuterClass();
		
		//creating object for inner class
		Inner inner=out_class.new Inner();
		inner.showInner();
		
		//creating object for static inner class
		StaticInner staticInner=new StaticInner();
		staticInner.showstaticInner();
		
	}
}


