
public class forLoop {

	public static void main(String[] args) {
		//sum of number divisible by 
		int n=0, count=0;
		for(int i=1;i<=100;i++) {
			if((i%3==0)&&(i%5==0)) {
				n+=i;
				count++;
			}
			//for first 5 iterations
			if(count>=5) {
				break;
			}
		}
		System.out.println("Sum :" +n);
		System.out.println("Count :"+count);
		
		//pattern
		for(int i=0;i<5;i++) {
			for(int j=0;j<i;j++) {
				System.out.println("*");
			}
			System.out.println(" ");
		}
	}
}
