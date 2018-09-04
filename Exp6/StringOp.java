import java.util.ArrayList;
import java.util.Scanner;
class StringArray
{
	private ArrayList<String> s;
	StringArray()
	{
		s=new ArrayList<String>();
	}
	void append(String a)
	{
		s.add(a);
	}
	void insert(String a ,int pos) throws IndexOutOfBoundsException
	{
		if(pos-1<0)
			throw new IndexOutOfBoundsException("test");
		s.add(pos-1, a);
		//
	}
	String search(String key) throws java.lang.NullPointerException
	{
		if(s.contains(key))
			return key;
		else
			return null;
	}
	String[] startswith(char a)
	{
		StringBuilder b=new StringBuilder();
		for(String x:s)
		{
			if(x.charAt(0)==a)
				b.append(x+",");
		}
		return b.toString().split(",");
	}
	void display()
	{
		for(String x:s)
			System.out.println(x);
	}
}
public class StringOp {
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		StringArray a=new StringArray();
		while(true)
		{
			System.out.println("\n1.Append\n2.Insert\n3.Search\n4.Startswith\n5.Display\nAny to exit");
			int ch=input.nextInt();
			if(ch==1)
			{
				System.out.println("Enter String to append");
				a.append(input.next());
			}
			else if(ch==2)
			{
				System.out.println("Enter String to append and its position");
				try
				{
					a.insert(input.next(), input.nextInt());
				}
				catch(IndexOutOfBoundsException e)
				{
					e.printStackTrace();
				}
			}
			else if(ch==3)
			{
				System.out.println("Enter String to search");
				String s=input.next();
				String str=a.search(s);

				if(str==null)
					System.out.println("Not found");
				else
					System.out.println("Found "+a.search(s));

			}
			else if(ch==4)
			{
				System.out.println("Enter first char to compare");
				char cc=input.next().charAt(0);
				String str[]=a.startswith(cc);
				System.out.println("Strings starting with "+cc );
				for(String x:str)
					System.out.println(x);
			}
			else if(ch==5)
				a.display();
			else
				break;

		}
		input.close();
	}

}
