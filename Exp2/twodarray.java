import java.util.*;
public class twodarray {
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		int a[][]=new int[4][5];
		System.out.println("Enter input in 4 lines with 5 numbers in each line");
		int i,j;
		for(i=0;i<4;i++)
		{
			for(j=0;j<5;j++)
				a[i][j]=input.nextInt();
		}
		System.out.println("Echo the data ");
		for(i=0;i<4;i++)
		{
			System.out.print("\n");
			for(j=0;j<5;j++)
				System.out.print(" "+a[i][j]);
		}
		input.close();
		
	}

}
