package interruptDemo;

public class test {

	public static void main(String[] args) {
		
		String tname = Thread.currentThread().getName();
		System.out.println(tname+" : Thread started!");
		
		
		Thread w1 = new Thread(new worker()); //creating thread
		// similar to
		/* worker obj = new worker();
		 * Thread t1 = new Thread(obj);
		 */
		w1.setName("w1");
		w1.start();
		
		// putting main thread to sleep
		try {
			Thread.sleep(3000);
			//interrupting thread w1
			w1.interrupt();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(tname+" : Thread Ended!");
		
	}
	
}
