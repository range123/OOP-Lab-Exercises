import java.util.*;
public class insertion {
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		int n;
		int a[]=new int[30];
		System.out.println("Enter the size of the array");
		n=input.nextInt();
		System.out.println("Enter the elements of the array");
		for(int i=0;i<n;i++)
			a[i]=input.nextInt();
		int j,temp;
		for(int i=1;i<n;i++)
		{
			temp=a[i];
			j=i-1;
			while( j>=0 && (temp<a[j]))
			{
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=temp;
		}
		System.out.println("After sorting");
		for(int i=0;i<n;i++)
			System.out.println(" "+a[i]);
		input.close();
			
	}

}
