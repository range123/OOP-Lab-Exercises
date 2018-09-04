import java.util.Scanner;


class GenMaxClass<T extends Comparable<T>> {
	T max(T[] obj)
	{
		T m=obj[0];
		for(T x:obj)
		{
			if(x.compareTo(m)>0)
				m=x;
		}
		return m;
	}

}
public class GenMax
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		GenMaxClass<String> obj=new GenMaxClass<String>();
		String a[]=new String[3];
		System.out.println("Enter 3 strings");
		for(int i=0;i<3;i++)
		{
			a[i]=input.next();
		}
		System.out.println("Max is = "+obj.max(a));
		input.close();
	
				
	}
}