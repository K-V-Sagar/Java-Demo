//***********************
//Multi threading by extending the class Thread
//************************
public class multiThread extends Thread{

	//overriding the run() of the class Thread
	//Mandatory
	public void run() {
		String tname = Thread.currentThread().getName();
		for(int i=1;i<=20;i++) {
			System.out.println(tname+" : i :"+i);
		}
	}
	
	public static void main(String[] args) {
		
		multiThread obj = new multiThread();
		//setting name for sub thread and can't set name to main
		obj.setName("iloop");
		// calls the run() method
		//mandatory
		obj.start();
		
		String tname = Thread.currentThread().getName();// gives thread identity
		for(int j=1;j<=20;j++) {
			System.out.println(tname+ " : j :"+j);
		}
		
	}
	
}


//******************
/* SAMPLE OUTPUT
j:1
i:1
j:2
i:2
j:3
i:3
i:4
j:4
i:5
j:5
j:6
i:6
j:7
j:8
j:9
i:7
i:8
i:9
j:10
j:11
j:12
j:13
j:14
j:15
j:16
j:17
j:18
j:19
j:20
i:10
i:11
i:12
i:13
i:14
i:15
i:16
i:17
i:18
i:19
i:20
*/
