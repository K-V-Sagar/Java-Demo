package lists;

import java.util.ArrayList;

public class demo {
	
	public static void main(String[] args) {
		
		ArrayList myList = new ArrayList();
		myList.add(10);
		myList.add(20);
		myList.add("Hey");
		myList.add('s');
		myList.add(3.14);
		System.out.println(myList);
		System.out.println("--------------");
		
		ArrayList<Integer> intList = new ArrayList<>();
		intList.add(10);
		//exact interpretation as list can take only objects
		// everywhere else autoboxing is done to convert to object
		intList.add(new Integer(20)); 
		intList.add(30);
		intList.add(40);
		System.out.println(intList);
		intList.add(2, 25);
		System.out.println(intList);
		intList.set(4, 35);
		System.out.println(intList);
	}
	
}
