import java.util.Scanner;
public class primenumbers {
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter n");
		int n=input.nextInt();
		int i,j,c=0;
		for(i=0;i<n;i++)
		{
			c=0;
			for(j=1;j<n;j++)
			{
				if((i%j)==0)
				{
					c++;
				}
			}
			if(c==2)
				System.out.println(i);
		}
		input.close();
	}
	

}
