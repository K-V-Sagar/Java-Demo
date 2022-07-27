package sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class diffSets {

	public static void main(String[] args) {
		
		// Hash Set
		Random rand = new Random();
		Set<Integer> list1 = new HashSet<>();
		for(int i=0;i<5;i++) {
			int randNum = rand.nextInt(100); 
			System.out.println(randNum);
			list1.add(randNum);
		}
		System.out.println("HashSet :"+list1);
		
		// Linked Hash Set
		list1 = new LinkedHashSet<>();
		for(int i=0;i<5;i++) {
			int randNum = rand.nextInt(100); 
			System.out.println(randNum);
			list1.add(randNum);
		}
		System.out.println("LinkedHashSet :"+list1);
		
		// Tree Set
		list1 = new TreeSet<>();
		for(int i=0;i<5;i++) {
			int randNum = rand.nextInt(100); 
			System.out.println(randNum);
			list1.add(randNum);
		}
		System.out.println("TreeSet :"+list1);
		// Tree set string
		Set<String> names = new TreeSet<>();
		names.add("xyz");
		names.add("abc");
		names.add("def");
		System.out.println("Treeset names: " + names);
	}
	
}
