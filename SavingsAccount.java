
public class SavingsAccount extends BankAccount{
	
	private double balance;
	
	private double interest;
	
	public SavingsAccount(int accountNumber,double balance) {
		
		super(accountNumber,"Savings Account");
		
		this.balance = balance;		
		
	}

double calculateInterest() {
		
	interest = 	balance * ( 3.5/100);
	return interest;
	}

}
