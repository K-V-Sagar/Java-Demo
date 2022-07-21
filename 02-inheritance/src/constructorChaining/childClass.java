package constructorChaining;

public class childClass extends parentClass{
	
	childClass(){
		//calls parentClass() default constructor
		System.out.println("Child Class : No Args");
	}
	
	childClass(int a){
		//as super(a) exists it doesn't call paentClass() default constructor
		super(a); // calls parentClass(int a)
		System.out.println("Child Class : One Arg");
	}

}
