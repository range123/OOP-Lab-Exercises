import java.util.Scanner;
public class stringrev {
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		StringBuilder a=new StringBuilder("");
		String b= new String("");
		int i=0;
		System.out.println("Enter the string ");
		b=input.next();
		while(b.charAt(i)!='.' && i<10)
		{
			a.append(b.charAt(i));
			i++;

		}
		System.out.println("After reversing = "+a.reverse());
		input.close();
		
		
	}

}
