package staticContext;

public class nonStatic {
	static int y=2;
	int num=10; //non static var or instance var
	
	{
		System.out.println("non static block executed");
	}
	
	nonStatic(int x){
		System.out.println("constructor executed");
		this.num = x;
	}
	
	public static void main(String[] args) {
		System.out.println("main method executed");
		nonStatic obj1 = new nonStatic(20); //creating obj of class executed non-static block
		nonStatic obj2 = new nonStatic(21);
		System.out.println("non-static/instance variable : "+obj1.num);
		System.out.println("non-static/instance variable : "+obj2.num);
		System.out.println("static variable :"+obj1.y);
		System.out.println("static variable :"+obj2.y);
	}
}
