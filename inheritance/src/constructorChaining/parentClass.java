package constructorChaining;

public class parentClass {
	
	int x;
	
	parentClass(){
		this(25); //calls constructor with one arg
		System.out.println("Parent Class : No Args");
	}
	
	parentClass(int a){
		this.x=a;
		System.out.println("Parent Class : One Arg");
	}

}
