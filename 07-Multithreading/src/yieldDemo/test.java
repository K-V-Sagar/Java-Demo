package yieldDemo;

public class test {

	public static void main(String[] args) {
		
		//Thread 1
		yieldClass obj1 = new yieldClass();
		Thread t1 = new Thread(obj1);
		t1.setName("t1");
		t1.start();
		// yield() can be used in the class or can be accessed by object
		//t1.yield();
		
		//Thread 2
		yieldClass obj2 = new yieldClass();
		Thread t2 = new Thread(obj2);
		t2.setName("t2");
		t2.start();
		
		//allowed
		//Thread t4 = new Thread(new yieldClass());
		//allowed
		//Thread t4 =new Thread(obj2);
		
		//Thread 3
		alphaLoop obj3 = new alphaLoop();
		Thread t3 = new Thread(obj3);
		t3.setName("t3");
		t3.start();
		
		String tname = Thread.currentThread().getName();
		for(int i=0;i<10;i++) {
			System.out.println(tname+" : "+i);
		}
		
	}
	
}
