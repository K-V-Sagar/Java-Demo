package staticContext;

public class bankAccount {
	int accountNo;
	int balance;
	static String bankName = "SBI";
	static double rateOfInterest = 8.5;
	
	//construct
	bankAccount(int AccountNum, int AccountBal){
		this.accountNo = AccountNum;
		this.balance = AccountBal;
	}
	
	void display() {
		System.out.println("Wecome to "+bankName);
		System.out.println("Loan interest rate :"+rateOfInterest);
		System.out.println("Account number :"+this.accountNo); //use this for non-static instance var
		System.out.println("Balance :"+this.balance);
		System.out.println("------------------");
	}
}
