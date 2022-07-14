
public class ternaryop {

	public static void main(String[] args) {
		int age=21;
		boolean hasLiscense=true;
		boolean canDrive=(age>18)?true:false;
		boolean canRentACar=canDrive?hasLiscense?true:false:false;
		//same as canDrive ? (hasLiscense ? true : false) : false
		//replicates a nested if
		System.out.println("Can Drive: "+canDrive);
		System.out.println("can rent a car: "+canRentACar);
	}
}
