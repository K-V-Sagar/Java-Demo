package staticContext;

public class staticBlock {
	public static void main(String[] args) {
		System.out.println("main block executed");
	}
	static {
		System.out.println("static block executed");
	}
	//static block is executed first and then main
}
