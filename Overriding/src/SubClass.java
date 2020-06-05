
public class SubClass extends Base {
public static void main(String[] args) {
	SubClass sc = new SubClass();
	
}
 public SubClass() 
 {
	 MethodHello();
	 
 }
 @Override
	public void MethodHello() {
		// TODO Auto-generated method stub
		super.MethodHello();//------this retrieves the value which is in Base class
	 // to override the method in Parent class
	 System.out.println("Overriding Base Class Method Hello --- Hi");
	}

}
