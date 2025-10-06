package bank;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<BankAccount> Bank=new ArrayList<>();
		Bank.add(new BankAccount(101,"Rahul",1000,1507));
		boolean found=true;
		while(found==true)
		{
		System.out.println("1.Login");
	    System.out.println("2.Exit");
	    int choice=sc.nextInt();
	    if(choice==1)
	    {
		System.out.println("Enter AccountNumber:");
		int acc=sc.nextInt();
		System.out.println("Enter Pin:");
		int pin=sc.nextInt();
		for(BankAccount bank:Bank)
		{
			if(bank.getAccountNumber()==acc && bank.getPin()==pin)
			{
				System.out.println("Login Successfull");
				boolean found1=true;
				while(found1==true)
				{
				System.out.println("1.Deposit");
			    System.out.println("2.Withdraw");
			    System.out.println("3.Get-Balance");
			    int choice1=sc.nextInt();
			    if(choice1==1)
			    {
			    	System.out.println("Enter Amount to Deposit");
			    	double dep=sc.nextInt();
			    	bank.deposit(dep);
			    }
			    else if(choice1==2)
			    {
			    	System.out.println("Enter Amount to Withdraw");
			    	int draw=sc.nextInt();
			    	bank.withdraw(draw);
			    }
			    else if(choice1==3)
			    {
			    	System.out.println(bank.getBalance());
			    }
			    else if(choice1==4)
			    {
			    	System.out.println("Account Logged Out ");
			    	found1=false;
			    }
			    else
			    {
			    	System.out.println("Enter Valid Option");
			    }
			}
		}
			else
			{
				System.out.println("Account Number Or PassWord Incorrect");
			}
	    }
	    }
	    else if(choice==2)
	    {
	    	System.out.println("Thank You");
	    	found=false;
	    }
	    else
	    {
	    	System.out.println("Invalid Option");
	    }
	    }
		sc.close();
	}
	
}
