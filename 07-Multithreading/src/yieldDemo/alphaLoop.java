package yieldDemo;

public class alphaLoop implements Runnable{

	@Override
	public void run() {
		String tname = Thread.currentThread().getName();
		for(int i=0;i<10;i++) {
			System.out.println(tname+" : abc");
		}
	}

	
}
