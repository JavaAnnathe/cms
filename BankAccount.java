
public class BankAccount {
	
	int accountNumber;
	
	public int getAccountNumber() {
		return accountNumber;
	}

	
	int interestRate;
	
	String accountType;
	
	public BankAccount() {
		
		
	}
	
	public BankAccount(int accountNumber,String accountType) {
		
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		
	}
	
	double calculateInterest() {
		
		return 0.0;
	}




}
