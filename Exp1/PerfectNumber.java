import java.util.Scanner;
public class PerfectNumber {
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=input.nextInt();
		int n=num,sum=0;
		int x=num/2;
		for(int i=1;i<=x;i++)
		{
			if(num%i==0)
			{
				sum+=i;
			}
		}
		if(sum==n)
			System.out.println("It is a perfect number");
		else
			System.out.println("It is not a perfect number");
		input.close();
	}

}
