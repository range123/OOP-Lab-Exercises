import java.util.Scanner;
public class binary {
	public static void main(String args[])
	{
		Scanner input= new Scanner(System.in);
		int a[]=new int[30];
		int i,n;
		System.out.println("Enter the size of the array");
		n=input.nextInt();
		System.out.println("Enter elements of the array in sorted order");
		for(i=0;i<n;i++)
			a[i]=input.nextInt();
		int c,k=0;
		System.out.println("Enter value to search");
		c=input.nextInt();
		int first=0,last=n-1,mid;
		while(first<=last)
		{
			mid=(first+last)/2;
			if(a[mid]==c)
			{
				k=1;
				System.out.println("Element found at "+mid);
				break;
			}
			else if(c<a[mid])
			{
				last=mid-1;
			}
			else
				first=mid+1;
				
		}
		if(k==0)
			System.out.println("Element not found");
		input.close();
		
	}

}
