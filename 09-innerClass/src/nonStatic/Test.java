package nonStatic;

import nonStatic.Outer.Inner;

public class Test {

	public static void main(String[] args) {
		Outer outer = new Outer(80);
		outer.f1();
		
		Outer.Inner inner = outer.new Inner(30);
		inner.f2();
		
	}
}
