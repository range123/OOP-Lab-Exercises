import java.util.*;
class Account
{
	private long acc_no;
	private double balance;
	private static double minbal=1000;
	/*Account()
	{
		this.acc_no=0;
		this.balance=0;
	}*/
	double get_minbal()
	{
		return minbal;
	}
	void setBalance(double bal)
	{
		balance=bal;
	}
	Account(long a,double b)
	{
		this.acc_no=a;
		this.balance=b;
	}
	Account()
	{
		this.balance=Account.minbal;
		Random r=new Random();
		this.acc_no = 10000000 + r.nextInt(90000000);
		
	}
	void deposit(double amount)
	{
		balance=balance+amount;
	}
	boolean withdraw(double amount)
	{
		if((balance-amount)<minbal)
			return false;
		else
		{
			balance=balance-amount;
			return true;
		}
		
	}
	long get_acc_no( )
	{
		return this.acc_no;
	}
	double get_balance()
	{
		return this.balance;
	}
	
	//Copy Constructor
	Account(Account a)
	{
		this.acc_no=a.acc_no;
		this.balance=a.balance;
	}
	//Transfer
	void transfer(Account b,double amount)
	{
		if(b.withdraw(amount))
		{
			this.deposit(amount);
		}
		else
			System.out.println("Transfer failed");
		
	}
	void display()
	{
		System.out.println("Acc no = "+acc_no+" Balance = "+balance);
	}
}