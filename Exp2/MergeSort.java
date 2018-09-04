import java.util.*;
public class MergeSort {
	public static void merge(int a[],int l,int m,int r)
	{
		 int n1 = m - l + 1;
	     int n2 = r - m;
	     int L[] = new int [n1];
	     int R[] = new int [n2];
	     for (int i=0; i<n1; ++i)
	            L[i] = a[l + i];
	     for (int j=0; j<n2; ++j)
	            R[j] = a[m + 1+ j];
			int i=0,j=0,k=l;
			while(i<n1 && j<n2)
			{
				if(L[i]<=R[j])
				{
					a[k]=L[i];
					i++;
					k++;
				}
				else
				{
					a[k]=R[j];
					k++;
					j++;
				}
			}
			while(i<n1)
			{
				a[k]=L[i];
				k++;
				i++;
			}
			while(j<n2)
			{
				a[k]=R[j];
				k++;
				j++;
			}
		}
	
	
	public static void mergeS(int a[],int l,int r)
	{
		if(l<r)
		{
		int mid=(l+r)/2;
		mergeS(a,l,mid);
		mergeS(a,mid+1,r);
		merge(a,l,mid,r);
		}
	}
		
		
		
	
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		int a[]=new int[30];
		int n;
		System.out.println("Enter the number of elements");
		n=input.nextInt();
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++)
			a[i]=input.nextInt();
		mergeS(a,0,n);
		System.out.println("Array after sorting is");
		for(int i=1;i<n+1;i++)
			System.out.print(a[i]+" ");
		input.close();
		
	}
	

}
