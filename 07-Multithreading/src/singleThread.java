
public class singleThread {

	public void print() {
		for(int i=1;i<=20;i++) {
			System.out.println("i:"+i);
		}
	}
	
	public static void main(String[] args) {
		
		singleThread obj = new singleThread();
		obj.print();
		
		for(int j=1;j<=20;j++) {
			System.out.println("j:"+j);
		}
		
	}
	
}


//************************
/* SAMPLE OUTPUT
i:1
i:2
i:3
i:4
i:5
i:6
i:7
i:8
i:9
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
j:1
j:2
j:3
j:4
j:5
j:6
j:7
j:8
j:9
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
*/