package fullAbstraction;

public class test {
	
	public static void main(String[] args) {
		
		car obj1 = new honda(); //is same as
		// honda obj1 = new honda();
		obj1.go();
		obj1.stop();
		
		System.out.println("---------------------");
		
		car obj2 = new toyota();
		obj2.go();
		obj2.stop();
		
	}

}
