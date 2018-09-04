import  java.util.Scanner;;
public class bubble {
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		int a[]=new int[30];
		int n;
		System.out.println("Enter the size of the array");
		n=input.nextInt();
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++)
			a[i]=input.nextInt();
		int temp;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("The sorted array is ");
		for(int i=0;i<n;i++)
			System.out.print(" "+a[i]);
		input.close();
		
	}

}
