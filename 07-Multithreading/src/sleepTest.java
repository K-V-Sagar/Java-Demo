
public class sleepTest {

	//overriding the run() of the class Thread
		//Mandatory
		public void run() {
			for(int i=1;i<=20;i++) {
				System.out.println("i:"+i);
				//sleep() by default must be handle for InterruptedException 
				try {
					Thread.sleep(200); //puts this thread to sleep for 200ms
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		public static void main(String[] args) {
			
			multiThread obj = new multiThread();
			// calls the run() method
			//mandatory
			obj.start();
			
			for(int j=1;j<=20;j++) {
				System.out.println("j:"+j);
			}
			
		}
	
}
