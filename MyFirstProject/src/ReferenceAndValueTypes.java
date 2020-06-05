
public class ReferenceAndValueTypes {

	public static void main(String[] args) {
		
		int x = 20;
		
		Person  vamshi;
		
		vamshi = new Person("Vamshi", 20);
		
		
		
		referenceValueUpdate(vamshi);
		System.out.println(vamshi.getAge());

	}

	private static void referenceValueUpdate(Person vamshi) {
		
		vamshi.setAge(vamshi.getAge() + 5);
		
	}

}
