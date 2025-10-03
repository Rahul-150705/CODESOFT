package bank;

public class BankAccount {
	private int accountNumber;
	String Accountholder;
	private double balance;
	private int pin;
	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public BankAccount(int accountNumber, String accountholder, double balance, int pin) {
		super();
		this.accountNumber = accountNumber;
		Accountholder = accountholder;
		this.balance = balance;
		this.pin = pin;
	}
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void deposit(double deposit)
	{
		balance+=deposit;
		System.out.println("Deposited");
	}
	public void withdraw(int withdraw)
	{
		if(withdraw<=balance)
		{
			balance-=withdraw;
		}
	}
	public void checkBalance() {
		getBalance();
	}
}
