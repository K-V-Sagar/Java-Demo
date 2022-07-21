package constructorChaining;

public class testClass {
	
	public static void main(String[] args) {
		//first goes to childClass and as it extends parentClass
		// it first executes parentClass, finds parentClass()
		// which calls parentClass(int a)
		childClass obj = new childClass();
		
		System.out.println("------------------");
		
		// goes to childClass and finds childClass(int a)
		// first executes super(a) which calls parentClass(int a)
		// and then executes childClass(int a)
		childClass obj1 = new childClass(10);
	}
	

	

}
