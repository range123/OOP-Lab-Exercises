import java.util.*;
public class matmul {
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		int a[][]=new int[3][3];
		int b[][]=new int[3][3];
		int c[][]=new int[3][3];
		int r1,c1,r2,c2;
		System.out.println("Enter the number of rows and columns of the first matrix");
		r1=input.nextInt();
		c1=input.nextInt();
		System.out.println("Enter the number of rows and columns of the second matrix");
		r2=input.nextInt();
		c2=input.nextInt();
		if(c1!=r1)
		{
			System.out.println("Cannot multiply");
			System.exit(0);
		
	}
		else
		{
			System.out.println("Enter elements of matrix 1");
			int i,j,k;
			for(i=0;i<r1;i++)
			{
				for(j=0;j<c1;j++)
					a[i][j]=input.nextInt();
			}
			System.out.println("Enter elements of matrix 2");
			for(i=0;i<r2;i++)
			{
				for(j=0;j<c2;j++)
					b[i][j]=input.nextInt();
			}
				
			for(i=0;i<r1;i++)
			{
				for(j=0;j<c1;j++)
				{
					c[i][j]=0;
					for(k=0;k<c2;k++)
					{
						c[i][j]+=a[i][k]*b[k][j];
					}
				}
			}
		}
		System.out.println("After multiplying");
		for(int i=0;i<r1;i++)
		{
			System.out.print("\n");
			for(int j=0;j<c2;j++)
				System.out.print(" "+c[i][j]);
		}
		input.close();

}
}
