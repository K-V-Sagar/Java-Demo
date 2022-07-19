package superKeyword;

public class testClass {
	
	public static void main(String[] args) {
		
		childClass obj1 = new childClass();
		System.out.println("a: "+obj1.a);
		System.out.println("b: "+obj1.b);
		System.out.println("c: "+obj1.c);
		System.out.println("d: "+obj1.d);
		
		System.out.println("---------------");
		
		childClass obj2 = new childClass(3,4);
		System.out.println("a: "+obj2.a);
		System.out.println("b: "+obj2.b);
		System.out.println("c: "+obj2.c);
		System.out.println("d: "+obj2.d);
		
		System.out.println("---------------");
		
		childClass obj3 = new childClass(1,2,3,4);
		System.out.println("a: "+obj3.a);
		System.out.println("b: "+obj3.b);
		System.out.println("c: "+obj3.c);
		System.out.println("d: "+obj3.d);
	}

}
