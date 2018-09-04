import java.util.Scanner;
public class linear {
	public static void main(String args[])
	{
		Scanner input= new Scanner(System.in);
		int a[]=new int[30];
		int i,n;
		System.out.println("Enter the size of the array");
		n=input.nextInt();
		System.out.println("Enter elements of the array");
		for(i=0;i<n;i++)
			a[i]=input.nextInt();
		int c,k=0;
		System.out.println("Enter value to search");
		c=input.nextInt();
		for(i=0;i<n;i++)
		{
			if(a[i]==c)
			{
				k=1;
				System.out.println("Element found at "+i);
				break;
			}
		}
		if(k==0)
			System.out.println("Element not found");
		input.close();
		
	}

}
