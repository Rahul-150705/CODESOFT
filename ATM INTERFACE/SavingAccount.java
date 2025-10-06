package bank;

public class SavingAccount extends BankAccount{
	public SavingAccount(int accountNumber, String accountholder, double balance) {
		super(accountNumber, accountholder, balance);
	}
	public void interest(int interestRate)
	{
		double interest=getBalance()*interestRate*100;
		deposit(interest);
		System.out.println("Interest Inserted Successfully");
	}
}
