package sets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class hashSet {

	public static void main(String[] args) {
		
		// set doesn't store duplicate values
		Set<Integer> set1 = new HashSet<Integer>();
		set1.add(10);
		set1.add(20);
		set1.add(10);
		set1.add(30);
		set1.add(10);
		System.out.println("Set 1: "+set1);
		// creating a list
		Random rand = new Random();
		List<Integer> list1 = new ArrayList<>();
		for(int i=0;i<10;i++) {
			int randNum = rand.nextInt(3); // gives random numbers within 3
			list1.add(randNum);
		}
 		System.out.println("List with duplicate numbers: "+list1);
 		// copying the list to the set
 		Set<Integer> set2 = new HashSet<Integer>(list1);
 		System.out.println("Set formed using list 1: "+set2);
	}
	
}
