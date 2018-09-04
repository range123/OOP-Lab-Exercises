import java.util.*;
public class Banking {
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		Account ravi=new Account();
		System.out.println("Enter account number and balance for mala");
		Account mala=new Account(input.nextLong(),input.nextDouble());
		System.out.println("Enter money to Deposit to mala");
		mala.deposit(input.nextDouble());
		System.out.println("Enter money to Withdraw from mala");
		if(!mala.withdraw(input.nextDouble()))
			System.out.println("Withdraw failed,insufficient balance");
		Account leela=new Account(mala);
		System.out.println("Details of Leela");
		System.out.println("Account no = "+leela.get_acc_no()+"\nBalance = "+leela.get_balance());
		System.out.println("Enter money to transfer from leela to ravi ");
		ravi.transfer(leela,input.nextDouble());
		System.out.println("Ravi\n"+"Account no = "+ravi.get_acc_no()+"\nBalance = "+ravi.get_balance());
		input.close();
		
	}

}
