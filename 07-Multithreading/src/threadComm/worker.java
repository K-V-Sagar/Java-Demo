package threadComm;

public class worker implements Runnable{

	private int total;
	
	public int getTotal() {
		return total;
	}
	
	@Override
	public void run() {
		String tname = Thread.currentThread().getName();
		System.out.println(tname+" : Calaculation begin.");
		synchronized (this) {
			for(int i=1;i<=10;i++) {
				total+=i;
			}
			System.out.println(tname+" : Calculation complete. Notifying...");
			this.notify(); // ** releases lock on the thread
		}
		System.out.println(tname+" : Calculation ended.");
	}
	
}
