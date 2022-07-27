package lists;

import java.util.ArrayList;
import java.util.List;

public class demo2 {

	public static void main(String[] args) {
		
		// using super class for creating new list
		// example of polumorphism
		List<Integer> list1 = new ArrayList<>();
		for(int i=10;i<=40;i+=10) {
		list1.add(i);
		}
		System.out.println("List 1: "+list1);
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(50);
		list2.add(60);
		list2.add(70);
		list2.add(80);
		System.out.println("List 2: "+list2);
		
		list1.addAll(2, list2);
		System.out.println("After adding list 2 to list 1: "+list1);
		
		System.out.println("Element at index 3 is: "+list1.get(3));
		
		list1.remove(3);
		System.out.println("After removing element at 3: "+list1);
		
		list1.remove(new Integer(50));
		System.out.println("After removing element with value 50: "+list1);
		
	}
	
}

//************
// Array list is not a good choice for too many insertion and deletion operations
// as to insert an element the entire array has to be moved
