
public class Scope {

	static int x = 6; ;

	public static void main(String[] args)
	{
		int x = 10;
		System.out.println(x);
		
		method1();

	}
	static void method1() 
	{
		int x = 1;
		System.out.println(x);
		
	}

}
	