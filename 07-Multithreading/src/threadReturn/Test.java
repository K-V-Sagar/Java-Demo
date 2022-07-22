package threadReturn;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test {
	
	public static void main(String[] args) {
		
		//creating an array of object workers of size 5
		Worker[] workers = new Worker[5];
		workers[0] = new Worker(5); //assigning value using parameterized constructor
		workers[1] = new Worker(20);
		workers[2] = new Worker(30);
		workers[3] = new Worker(15);
		workers[4] = new Worker(65);
		
		//creating 3 threads 
		ExecutorService service = Executors.newFixedThreadPool(3);
		//for-each loop
		for (Worker worker : workers) {
			// Future is used along with threads that return values
			// <> specifies it takes int values
			Future<Integer> future = service.submit(worker);
			try {
				Integer total = future.get();
				System.out.println("sum of : " + worker.getNum() + " = " + total);
			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
			}
		}
		service.shutdown();
	}

}

// ***********************
// SAMPLE OUTPUT
/*
pool-1-thread-1: Calculation begin for 5
pool-1-thread-1: Calculation end
sum of : 5 = 15
pool-1-thread-2: Calculation begin for 20
pool-1-thread-2: Calculation end
sum of : 20 = 210
pool-1-thread-3: Calculation begin for 30
pool-1-thread-3: Calculation end
sum of : 30 = 465
pool-1-thread-1: Calculation begin for 15
pool-1-thread-1: Calculation end
sum of : 15 = 120
pool-1-thread-2: Calculation begin for 65
pool-1-thread-2: Calculation end
sum of : 65 = 2145
*/