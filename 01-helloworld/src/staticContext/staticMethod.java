package staticContext;

public class staticMethod {
	
	static void method1() {
		System.out.println("static method executed");
	}
	static {
		System.out.println("static block executed");
		method1();
	}
	public static void main(String[] args) {
		System.out.println("main block executed");
		method1();
	}

}
