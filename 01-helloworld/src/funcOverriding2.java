
public class funcOverriding2 extends funcOverriding{
	
	public void dispThis() {
		System.out.println("Child class");
	}
	public static void main(String[] args) {
		funcOverriding2 obj = new funcOverriding2();
		obj.dispThis();
	}

}

