import java.util.*;
class MergeSort
{
	public void merge(int a[],int l,int m,int r)
	{
		int n1=m-l+1;
		int n2=r-m;
		int L[]=new int[n1];
		int R[]=new int[n2];
		for(int i=0;i<n1;i++)
			L[i]=a[l+i];
		for(int j=0;j<n2;j++)
			R[j]=a[m+j+1];
		int i=0,j=0,k=l;
		while(i<n1 && j<n2)
		{
			if(L[i]<R[j])
			{
				a[k]=L[i];
				k++;
				i++;
			}
			else
			{
				a[k]=R[j];
				j++;
				k++;
			}
			
		}
		while(i<n1)
		{
			a[k]=L[i];
			i++;
			k++;
		}
		while(j<n2)
		{
			a[k]=R[j];
			j++;
			k++;
		}
	}
public void sort(int a[],int l,int r)
{
	if(l<r)
	{
		int mid=(l+r)/2;
		sort(a,l,mid);
		sort(a,mid+1,r);
		merge(a,l,mid,r);
		
	}
}
	
	
}
public class MergeSorting {
	public static void main(String args[])
	{
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter number of elements");
		int n=input.nextInt();
		int a[]=new int[n+10];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++)
			a[i]=input.nextInt();
		MergeSort ms =new MergeSort(); 
		ms.sort(a, 0, n);
		System.out.println("After sorting");
		for(int i=1;i<=n;i++)
		{
			System.out.print(" "+a[i]);
		}
		input.close();
	}

}