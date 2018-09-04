
import java.util.Arrays;
import java.util.ArrayList;
interface stackfun//did not do Arrays implementation
{
	int pop();
	void push(int item);
	void display();
}
//Arraylist
class stacklist implements stackfun
{
	private ArrayList<Integer> a;
	stacklist()
	{
		a=new ArrayList<Integer>();
	}
	public void push(int elem)
	{
		a.add(0,elem);
	}
	public int pop() throws IndexOutOfBoundsException
	{
		int val=a.get(0);
		a.remove(a.get(0));
		
		return val;
		
	}
	public void display()
	{
		for(int e:a)
			System.out.println(e);
	}
	
}
//normal array
class stack implements stackfun
{
	private int a[],capacity,size,top;
	stack(int cap)
	{
		this.a=new int[cap+1];
		this.capacity=cap;
		this.size=0;
		this.top=0;
	}
	public void push(int elem)
	{
		if(isfull())
			System.out.println("Stack full");
		else
		{
			a[top]=elem;
			top++;
			size++;
		}

	}
	public int pop()
	{
		if(isempty())
		{
			//System.out.println("Stack empty");
			return -99;
		}
		else
		{
			size--;
			return a[--top];

		}

	}
	public void display()
	{
		if(isempty())
			System.out.println("Stack empty\n");
		else
		{
			int i=top-1;
			System.out.print("Stack : ");
			while(i>=0)
			{
				System.out.print(a[i]+ " ");
				i--;
			}
		}
	}

	public boolean isempty()
	{
		if(size==0)
			return true;
		else
			return false;
	}
	public boolean isfull()
	{
		if(size>=capacity)
			return true;
		else
			return false;
	}
}
public class StackOp {
	public static void main(String args[])
	{
		stacklist a=new stacklist();
		a.push(1);
		a.push(2);
		a.push(3);
		a.pop();
		a.display();
	}
	

}
