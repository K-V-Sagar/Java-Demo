
public class operatorsDemo {

	public static void main(String[] args)
	{
		int a=2, b=10, c=20;
		
		System.out.println("Case 1: "+(a<b && ++a<c));
		// ++a<c is not executed as a<b is false in logical AND
		System.out.println("'a' after logical AND: "+a);
		
		System.out.println("Case 1: "+(a<b & ++a<c));
		// ++a<c is executed to get final result in bitwise AND
		System.out.println("'a' after bitwise AND: "+a+"\n");
		
		
		// *** difference between = and == ***
		boolean bvar=false;
		//using check operator ==
		if(bvar==false)
			System.out.println("if statement is executed!");
		// using assignment operator =
		if(bvar=false) 
			System.out.println("if statement executed!");
		else
			System.out.println("if statemtn not executed!");
	}
}
