package finals;

public class B extends testFinal{
	
	int x=2;
	@Override
	void calcArea() {
		int area = x*x;
		System.out.println("Area: "+area);
	}
	
	public static void main(String[] args) {
		B obj = new B();
		obj.calcArea();
	}


	
}
