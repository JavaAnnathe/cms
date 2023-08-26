import java.util.Scanner;

public class InheritanceDemo {
	
	public static void main(String arg[]) {
		
		BankAccount bankAc =new BankAccount();
		Scanner scan = new Scanner(System.in);
		
		bankAc.calculateInterest();
		
		System.out.println("Interest Calculator. Choose your Bank Account");
		int i = scan.nextInt();
		
		if (i==1) {
			
			System.out.println("Enter your account number and balance");
			
			int accountNo = scan.nextInt();
			double balance = scan.nextDouble();
			SavingsAccount sbAccount = new SavingsAccount(accountNo,balance);
			
			System.out.println("Your SB account interest: "+sbAccount.calculateInterest());
		}
		
		else if(i==2) {
			
			System.out.println("Enter your account number,deposit amount and term");
			
			int accountNo = scan.nextInt();
			double deposit = scan.nextDouble();
			int term = scan.nextInt();
			FixedDepositAccount fd = new FixedDepositAccount(accountNo,deposit,term);
			
			System.out.println("Your Fixed Deposit interest: "+fd.calculateInterest());
			
			
		}
		else if(i==3) {
			
			System.out.println("Enter your account number,loan amount and term");
			
			int accountNo = scan.nextInt();
			double loanAmount = scan.nextDouble();
			int term = scan.nextInt();
			LoanAccount fd = new LoanAccount(accountNo,loanAmount,term);
			
			System.out.println("Your loan account interest: "+fd.calculateInterest());
		}
		
		
		
	}

}
