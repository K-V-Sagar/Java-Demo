
public class arraySum {

	public static void main(String[] args) {
		
		int a[]= {78, 34, 21, 11, 9};
		int sum=0, sum1=0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		System.out.println("Sum:"+sum);
		System.out.println("----------");
		for(int i : a) {
			sum1 += i;
		}
		System.out.println("Sum using for-each loop: "+sum1);
	}
	
}
