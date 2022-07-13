
public class stringmethods {
	
	public static void main(String[] args) {
		
		String s1="Hello World";
		System.out.println("String :"+s1);
		System.out.println("Length of string :"+s1.length());
		System.out.println("Index of 'W' :"+s1.indexOf('W'));
		System.out.println("Index of space :"+s1.indexOf(' '));
		System.out.println("Char at 3 :"+s1.charAt(3));
		//error
		//System.out.println("Char at 20 :"+s1.charAt(20));
	    System.out.println("Index of 'l' :"+s1.indexOf('l'));
	    System.out.println("Index of 2nd 'l' :"+s1.indexOf('l', 3)+"\n");
	    //substring
	    System.out.println("Substring :"+s1.substring(3));
	    System.out.println("Substring :"+s1.substring(3,8)+"\n");
	    
	    //split
	    String[] s2=s1.split(" ");
	    System.out.println(s2[0]);
	    System.out.println(s2[1]+"\n");
	    //Replace
	    System.out.println("Replaced :"+ s1.replace("l", "j"));
	    //to uppercase
	    System.out.println("Uppercase :"+s1.toUpperCase());
	    //to lowercase
	    System.out.println("lowercase :"+s1.toLowerCase());
	}

}
