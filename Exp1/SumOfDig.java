import java.util.Scanner;
public class SumOfDig {
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("enter the number");
		int num=input.nextInt();
		int sum=0,r;
		while(num!=0)
		{
			r=num%10;
			sum=sum+r;
			num=num/10;
		}
		System.out.println("The sum of the digits are "+sum);
		input.close();
		
	}

}
