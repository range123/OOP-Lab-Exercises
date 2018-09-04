import java.util.Random;
class AccountException extends Exception
{
	double amt;
	AccountException(double a)
	{
		amt=a;
	}
	public String toString()
	{
		return "Insufficient amount " + amt;
	}
}
class Account
{
	private long acc_no;
	private double balance;
	private static double minbal=1000;
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
	boolean withdraw(double amount) throws AccountException
	{
		if((balance-amount)<minbal)
			throw new AccountException(balance-amount);
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
	

	void display()
	{
		System.out.println("Acc no = "+acc_no+" Balance = "+balance);
	}
}
public class AccountTest {
	public static void main(String args[])
	{
		Account acc= new Account();
		try {
			acc.withdraw(5000);
		} catch (AccountException e) {
			System.out.println(e);
		}

	}

}
