import java.util.Scanner;
public class GCD {
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		int a,b,temp;
		System.out.println("Enter first number");
		a=input.nextInt();
		System.out.println("Enter second number");
		b=input.nextInt();
		int gcd=0;
		if(a>b)
		{
			temp=a;
			a=b;
			b=temp;
	}
		int i;
		for(i=1;i<=a;i++)
		{
			if(a%i==0 && b%i==0)
				gcd=i;
		}
		System.out.println("GCD is "+gcd);
		input.close();
	}

}
