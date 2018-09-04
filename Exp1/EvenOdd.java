import java.util.Scanner;
public class EvenOdd {
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the six digit number");
		String num1=input.next();
		int r,odd=0,eve=0,i=num1.length();
		int num=Integer.parseInt(num1);
		while(num!=0)
		{
			r=num%10;
			if(i%2==0)
				eve+=r;
			else
				odd+=r;
			num=num/10;
			i--;
		}
		System.out.println("Sum Of even Digits= "+eve);
		System.out.println("Sum Of Odd Digits= "+odd);
		input.close();
	}

}
