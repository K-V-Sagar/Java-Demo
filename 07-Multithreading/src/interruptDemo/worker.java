package interruptDemo;

public class worker implements Runnable{

	@Override
	public void run() {
		String tname = Thread.currentThread().getName();
		System.out.println(tname+" : Started!");
		for(int i=1;i<=10;i++) {
			System.out.println(tname+" : "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(tname+" : Thread Interrupted!");
				break;
			}
		}
		System.out.println(tname+" : Ended!");
		
	}

	
	
}
