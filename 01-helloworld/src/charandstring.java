
public class charandstring {

	public static void main(String[] args) {
		//character
		char a='D';
		int i=a;
		System.out.println("Character :"+a);
		System.out.println("ASCII value :"+i);
		char b=69;
		System.out.println("ASCII Character :"+b);
		a='\u0044';
		System.out.println("Unicode Character :"+a+"\n");
		
		//boolean
		boolean c=true;
		System.out.println("Boolean value is :"+c+"\n");
		
		//string literal
		String s1="Sagar";
		System.out.println("Name :"+s1);
		System.out.println("Length of name :"+s1.length());
		
		//creating object s2 of String class
		String s2 = new String("Hello"); 
		System.out.println(s2);
		
		//char array
		char[] d= {'h','i','!'};
		String s3 = new String(d);
		System.out.println(s3);
		
		//byte array
		byte[] e= {65,66,67};
		String s4 = new String(e);
		System.out.println(s4);
		
		
		
	}
}
