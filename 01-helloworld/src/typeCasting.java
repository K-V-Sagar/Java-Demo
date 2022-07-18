
public class typeCasting {

	public static void main(String[] args) {
		String input ="24";
		byte mybyte;
		mybyte=Byte.parseByte(input);
		System.out.println("Number is: "+mybyte);
		
		//byte + byte = int by deafult
		byte a=2;
		byte b=3;
		//below throws error 
		//byte result = a+b;
		byte result = (byte) (a+b);
		System.out.println("Result : "+result);

		
		
	
	}
}
