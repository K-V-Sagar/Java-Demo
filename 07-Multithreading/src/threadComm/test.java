package threadComm;

public class test {

	public static void main(String[] args) {
		
		String tname = Thread.currentThread().getName();
		System.out.println(tname+" : Main method begin.");
		
		worker obj = new worker();
		Thread w = new Thread(obj);
		w.setName("w");
		w.start();
		
		synchronized(w){
			System.out.println(tname + " : Waiting...");
			try {
				w.wait(); // ** makes the main wait for thread w
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(tname + " : Notified.");
			System.out.println(tname + ": Total = " + obj.getTotal());
		}
		
		System.out.println(tname+" : Main method end.");
	}

	
}
