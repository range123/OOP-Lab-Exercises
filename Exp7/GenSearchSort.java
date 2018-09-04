import java.util.Arrays;
import java.util.Scanner;
interface SearchSort<T extends Comparable<T>>
{
	T[] sort(T obj[]);
	T search(T obj[],T sear);
}
class SearchSortClass<T extends Comparable<T>> implements SearchSort<T>
{

	public T[] sort(T obj[]) {
		T temp;
		for(int i=0;i<obj.length;i++)
		{
			for(int j=0;j<obj.length-i-1;j++)
			{
				if(obj[j].compareTo(obj[j+1])>0)
				{
					temp=obj[j];
					obj[j]=obj[j+1];
					obj[j+1]=temp;
				}
			}
		}
		return obj;
		
	}

	public T search(T obj[],T sear) {
		for(T x:obj)
		{
			if(x.equals(sear))
				return x;
		}
		
		return null;
	}
	
}
public class GenSearchSort {
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		String a[]=new String[3];
		System.out.println("Enter 3 strings");
		for(int i=0;i<3;i++)
		{
			a[i]=input.next();
		}
		SearchSortClass<String> ss=new SearchSortClass<String>();
		String sorted[]=ss.sort(a);
		System.out.println("After sorting");
		for(String x:sorted)
		{
			System.out.println(x);
		}
		System.out.println("Enter element to search");
		if(ss.search(a,input.next())!=null)
			System.out.println("found");
		else
			System.out.println("Not found");
		input.close();
			
	}

}
