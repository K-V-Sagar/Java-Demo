package execFramework;

import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {

	public static void main(String[] args) {
		
		String tname = Thread.currentThread().getName();
		System.out.println(tname + ": Main method begin");
		
		// creating an array of objects
		CheckProcessorTask[] cpts = new CheckProcessorTask[4];
		cpts[0] = new CheckProcessorTask("ATM");
		cpts[1] = new CheckProcessorTask("Bank");
		cpts[2] = new CheckProcessorTask("Web");
		cpts[3] = new CheckProcessorTask("Mobile");
		
		//creating a thread pool
		ExecutorService pool = Executors.newFixedThreadPool(4);
		for (CheckProcessorTask x : cpts) {
			pool.submit(x); // submiit() assigns cpts to x
		}
//		for (int i=0; i<cpts.length; i++) {
//			fixedThreadPool.submit(cpts[i]);
//		}
		
		pool.shutdown(); // ends pool
		
		System.out.println(tname + ": Main method end");
		
	}
	
}