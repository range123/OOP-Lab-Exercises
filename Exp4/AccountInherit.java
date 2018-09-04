import java.util.*;
class SavingsAccount extends Account
{
	private double interest;
	SavingsAccount()
	{
		super();
		interest=5;
	}
	SavingsAccount(long a,double b,double in)
	{
		super(a,b);
		interest=in;
	}
	void deposit(double amount)
	{
		super.setBalance(super.get_balance()+amount);
	}
	boolean withdraw(double amount)
	{
		if((super.get_balance()-amount)<super.get_minbal())
			return false;
		else
		{
			super.setBalance(super.get_balance()-amount);
			return true;
		}
	}

	void updateBalance()
	{
		super.setBalance(super.get_balance()+(super.get_balance()*interest)/100);
	}
	void display()
	{
		System.out.println("Acc No = "+super.get_acc_no()+" Balance = "+super.get_balance()+" Interest = "+interest);
	}
}
class CurrentAccount extends Account
{
	private double overdraftlim;
	CurrentAccount()
	{
		super();
		overdraftlim=10000;
	}
	CurrentAccount(long a,double b,double over)
	{
		super(a,b);
		overdraftlim=over;
	}
	void deposit(double amount)
	{
		super.setBalance(super.get_balance()+amount);
	}
	boolean withdraw(double amount)
	{
		super.setBalance(get_balance()-amount);
		return true;

	}
	boolean isOverdraft()
	{
		if(super.get_balance()<0)
		{
			if(Math.abs(super.get_balance())>overdraftlim)
				return true;
			else
				return false;
		}
		else
			return false;
	}
	void display()
	{
		System.out.println("Acc No = "+super.get_acc_no()+" Balance = "+super.get_balance()+" Overdraftlimit = "+overdraftlim);
	}

}
class bank
{
	private ArrayList<Account> accobj;
	private ArrayList<SavingsAccount> saveobj;
	private ArrayList<CurrentAccount> currobj;
	bank()
	{
		accobj=new ArrayList<Account>();
		saveobj=new ArrayList<SavingsAccount>();
		currobj=new ArrayList<CurrentAccount>();
	}
	bank(ArrayList<Account> a,ArrayList<SavingsAccount> b,ArrayList<CurrentAccount> c)
	{
		accobj=a;
		saveobj=b;
		currobj=c;
	}
	void update()
	{
		for(int i=0;i<saveobj.size();i++)
		{
			saveobj.get(i).updateBalance();
		}
		for(int i=0;i<currobj.size();i++)
		{
			if(currobj.get(i).isOverdraft())
				System.out.println("Account number "+currobj.get(i).get_acc_no()+" has crossed overdraft limit");

		}
	}
	void openacc(SavingsAccount a)
	{
		saveobj.add(a);

	}
	void openacc(CurrentAccount a)
	{
		currobj.add(a);

	}
	void openacc(Account a)
	{
		accobj.add(a);
	}
	void closeacc(Account obj)
	{
		accobj.remove(obj);
	}
	void closeacc(SavingsAccount obj)
	{
		saveobj.remove(obj);
	}
	void closeacc(CurrentAccount obj)
	{
		currobj.remove(obj);
	}
	Object search(long acc)
	{
		for(int i=0;i<accobj.size();i++)
		{
			if(accobj.get(i).get_acc_no()==acc)
				return accobj.get(i);
		}
		for(int i=0;i<saveobj.size();i++)
		{
			if(saveobj.get(i).get_acc_no()==acc)
				return saveobj.get(i);
		}
		for(int i=0;i<currobj.size();i++)
		{
			if(currobj.get(i).get_acc_no()==acc)
				return currobj.get(i);
		}
		return null;

	}
	void deposit(long acc,double amount)
	{
		Object obj=search(acc);
		if(obj==null)
			System.out.println("Account not found");
		else if(obj.getClass().equals(Account.class))
		{
			Account a=(Account)obj;
			a.deposit(amount);
		}
		else if(obj.getClass().equals(SavingsAccount.class))
		{
			SavingsAccount a=(SavingsAccount)obj;
			a.deposit(amount);
		}
		else if(obj.getClass().equals(CurrentAccount.class))
		{
			CurrentAccount a=(CurrentAccount)obj;
			a.deposit(amount);
		}
			

	}
	void withdraw(long acc,double amount)
	{
		Object obj=search(acc);
		if(obj==null)
			System.out.println("Account not found");
		else if(obj.getClass().equals(CurrentAccount.class))
		{
			CurrentAccount a=(CurrentAccount)obj;
			a.withdraw(amount);

		}
		else if(obj.getClass().equals(SavingsAccount.class))
		{
			SavingsAccount a=(SavingsAccount)obj;
			if(!a.withdraw(amount))
				System.out.println("Insufficient balance");
		}
		else if(obj.getClass().equals(Account.class))
		{
			Account a=(Account)obj;
			if(!a.withdraw(amount))
				System.out.println("Insufficient balance");
		}
	}

	void displayall()
	{
		System.out.println("\n\tAccounts");
		for(int i=0;i<accobj.size();i++)
			accobj.get(i).display();
		System.out.println("\n\tSavings Accounts");
		for(int i=0;i<saveobj.size();i++)
			saveobj.get(i).display();
		System.out.println("\n\tCurrent Accounts");
		for(int i=0;i<currobj.size();i++)
			currobj.get(i).display();
	}
	void paydividend(double amount)
	{
		for(int i=0;i<accobj.size();i++)
			accobj.get(i).deposit(amount);
		for(int i=0;i<saveobj.size();i++)
			saveobj.get(i).deposit(amount);
		for(int i=0;i<currobj.size();i++)
			currobj.get(i).deposit(amount);
	}
}
public class AccountInherit {
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		bank b=new bank();
		int ch=-99;
		while(ch!=0)
		{
			System.out.println("\n1.Create Account\n2.Close Account\n3.Display\n4.Update accounts\n5.Deposit\n6.Withdraw\n7.Pay dividend\n");
			ch=input.nextInt();
			if(ch==1)
			{
				System.out.println("1.Account\n2.Savings Account\n3.Current Account");
				int c=input.nextInt();
				if(c==1)
				{
					System.out.println("Enter account number and balance");
					Account a=new Account(input.nextLong(),input.nextDouble());
					b.openacc(a);

				}
				else if(c==2)
				{
					System.out.println("Enter account number,balance and interest");
					SavingsAccount a=new SavingsAccount(input.nextLong(),input.nextDouble(),input.nextDouble());
					b.openacc(a);
				}
				else if(c==3)
				{
					System.out.println("Enter account number,balance and overdraftlimit");
					CurrentAccount a=new CurrentAccount(input.nextLong(),input.nextDouble(),input.nextDouble());
					b.openacc(a);
				}
			}
			else if(ch==2)
			{
				System.out.println("Enter account number to close");
				long acc=input.nextLong();
				Object obj=b.search(acc);
				if(obj.getClass().equals(Account.class))
					b.closeacc((Account)obj);
				else if(obj.getClass().equals(SavingsAccount.class))
					b.closeacc((SavingsAccount)obj);
				else if(obj.getClass().equals(CurrentAccount.class))
					b.closeacc((CurrentAccount)obj);
				else
					System.out.println("Account not found");

			}
			else if(ch==4)
			{
				b.update();
				System.out.println("Accounts Updated");
			}
			else if(ch==3)
				b.displayall();
			else if(ch==5)
			{
				System.out.println("Enter account number and amount to deposit");
				b.deposit(input.nextLong(),input.nextDouble());
			}
			else if(ch==6)
			{
				System.out.println("Enter account number and amount to withdraw");
				b.withdraw(input.nextLong(),input.nextDouble());
			}
			else if(ch==7)
			{
				System.out.println("Enter dividend amount");
				b.paydividend(input.nextDouble());
			}
		}
		input.close();


	}

}
