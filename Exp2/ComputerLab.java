import java.util.*;
public class ComputerLab {
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		int a[][]=new int[4][];
		a[0]=new int[5];
		a[1]=new int[6];
		a[2]=new int[4];
		a[3]=new int[3];
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<a[i].length;j++)
				a[i][j]=0;
		}
		while(true)
		{
			System.out.println("\n\n1.Login\n2.Logout\n3.Display\n4.Search\nAny key to exit");
			int ch=input.nextInt();
			if(ch==1)
			{
				System.out.println("Enter ID number");
				int id=input.nextInt();
				System.out.println("Enter Lab number");
				int lab=input.nextInt();
				System.out.println("Enter station number");
				int stat=input.nextInt();
				a[lab-1][stat-1]=id;
			}
			else if(ch==2)
			{
				System.out.println("Enter lab number");
				int lab=input.nextInt();
				System.out.println("Enter station number");
				int stat=input.nextInt();
				a[lab-1][stat-1]=0;
				}
			else if(ch==3)
			{
				for(int i=0;i<4;i++)
				{
					System.out.print("\n");
					System.out.print((i+1)+"."+"\t");
					for(int j=0;j<a[i].length;j++)
					{
						if(a[i][j]==0)
						{
							System.out.print((j+1)+": empty"+" ");
						}
						else
						{
							System.out.print((j+1)+": "+a[i][j]+" ");
						}
					}
				}
						
			}
			else if(ch==4)
			{
				int c=0;
				System.out.println("Enter Id number to search");
				int id=input.nextInt();
				for(int i=0;i<4;i++)
				{
					for(int j=0;j<a[i].length;j++)
					{
						if(a[i][j]==id)
						{
							c=1;
							System.out.println("User is on Lab "+(i+1)+" Station "+(j+1));
							break;
					}}
				}
				if(c==0)
					System.out.println("User is Offline");
			}
			else
				break;
		}
		input.close();
		
	}
}
