package linkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class demo2 {

	public static void main(String[] args) {
		
		Object[] objects = new Object[1000000];
		for (int i=0; i<objects.length; i++) {
			objects[i] = new Object();
		}
		
		List<Object> linklist = new LinkedList<>();
		long start1 = System.currentTimeMillis();
		for (Object object : objects) {
			linklist.add(object);
		}
		long end1 = System.currentTimeMillis();
		System.out.println("Time taken for adding to linkedlist: " + (end1 - start1) + " ms ");
		
		List<Object> arrlist = new ArrayList<>();
		long start2 = System.currentTimeMillis();
		for (Object object : objects) {
			arrlist.add(object);
		}
		long end2 = System.currentTimeMillis();
		System.out.println("Time taken for adding to Arraylist: " + (end2 - start2) + " ms ");
	}
	
}