
public class Methods {
	
	static String x = String.format("%03d", 7);

	public static void main(String[] args) {
		sayHelloWorld();
		
		sayHelloStringTo("Laptop");
		
		sayHelloStringTo(" Code");
		
		returnDataAndValue(x,"James Bond");
		
		int value = returnValue();
		System.out.println(value);
	}
	//----------------Static methods----------------------//
	//this method says hello World
	static void sayHelloWorld() 
	{
		System.out.println("Hey! Hello World");
	}
	// calling value directly from method using variable
	static int returnValue() 
	{
		return 002;
	}
	
	// this method days hello to whatever the name we passed
	static void sayHelloStringTo(String name) 
	{
		System.out.println("Hello,"+name);
	}
	
	static void returnDataAndValue(String x, String name) 
	{
		System.out.println("x value is "+x +" ,name is "+name);
	}
	
}
