package yieldDemo;

public class yieldClass implements Runnable {

	@Override
	public void run() {
		
		String tname = Thread.currentThread().getName();
		for(int i=0;i<10;i++) {
			Thread.yield(); // gives way for the other Thread
			System.out.println(tname+" : "+i);
		}
		
	}

}
