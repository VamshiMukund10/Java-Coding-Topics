
public class Loops {
	
	static void doWhileLoop() {
	int counter =10;
	do{
		System.out.println(counter);
		counter++;		
	}while(counter<10);
	}

	public static void main(String[] args)
	{
		
		// FOR loop
		for(int x = 1;x<11;x++) 
		{
		System.out.println(x);
		}
		int counter = 1;
		// WHILE loop
		while(counter<=10) 
		{
			System.out.println(counter);
			counter++;
		}
		doWhileLoop();
	}
	
}

