
public class LoanAccount extends BankAccount{
	
	private double loanAmount;
	
	private int term;
	
	private double interest;
	
	
	public LoanAccount(int accountNumber, double loanAmount, int term) {
		
		super(accountNumber,"Loan Account");
		
		this.loanAmount = loanAmount;
		this.term = term;
	}


  public double calculateInterest() {
	  
	  
	  interest = loanAmount * term * (8.5 / 100);
	  
	  return interest;
  }


}
