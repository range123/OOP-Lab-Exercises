//package stackusingobj;
import  java.util.Scanner;
class stackobj<T>
{
	private Object obj[];
	private int capacity,top;
	stackobj(int cap)
	{
		this.obj=new Object[cap+1];
		this.capacity=cap;
		this.top=0;
	}
	public void push(T elem)
	{
		if(isfull())
			System.out.println("Stack full");
		else
		{
			obj[top]=elem;
			top++;
		}

	}
	@SuppressWarnings("unchecked")
	public T pop()
	{
		if(isempty())
		{
			//System.out.println("Stack empty");
			return null;
		}
		else
		{
			return (T)obj[--top];

		}

	}
	@SuppressWarnings("unchecked")
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
				System.out.print((T)obj[i]+ " ");
				i--;
			}
		}
	}

	public boolean isempty()
	{
		if(top==0)
			return true;
		else
			return false;
	}
	public boolean isfull()
	{
		if(top>=capacity)
			return true;
		else
			return false;
	}

}
public class Stackgen {
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("1.Integer stack\n2.Character stack\n3.Double stack");
		int ch=input.nextInt();
		if(ch==1)
		{
			System.out.println("Enter capacity");
			stackobj<Integer> stack =new stackobj<Integer>(input.nextInt());
			while(true)
			{
				System.out.println("\n1.Push\n2.Pop\n3.Display\nAny Other to exit");
				int cho=input.nextInt();
				if(cho==1)
				{
					System.out.println("Enter the element to push");
					int e=input.nextInt();
					stack.push(e);
				}
				else if(cho==2)
				{
					int q=stack.pop();
					if(q==0)
						System.out.println("Stack empty");

					else
						System.out.println("Popped element= "+q);
				}
				else if(cho==3)
					stack.display();
				else
					break;
			}

		}
		else if(ch==2)
		{
			System.out.println("Enter capacity");
			stackobj<Character> stack =new stackobj<Character>(input.nextInt());
			while(true)
			{
				System.out.println("\n1.Push\n2.Pop\n3.Display\nAny Other to exit");
				int cho=input.nextInt();
				if(cho==1)
				{
					System.out.println("Enter the element to push");
					char e=input.next().charAt(0);
					stack.push(e);
				}
				else if(cho==2)
				{
					char q=stack.pop();
					if(q==0)
						System.out.println("Stack empty");

					else
						System.out.println("Popped element= "+q);
				}
				else if(cho==3)
					stack.display();
				else
					break;
			}
			
		}
		else if(ch==3)
		{
			System.out.println("Enter capacity");
			stackobj<Double> stack =new stackobj<Double>(input.nextInt());
			while(true)
			{
				System.out.println("\n1.Push\n2.Pop\n3.Display\nAny Other to exit");
				int cho=input.nextInt();
				if(cho==1)
				{
					System.out.println("Enter the element to push");
					double e=input.nextDouble();
					stack.push(e);
				}
				else if(cho==2)
				{
					double q=stack.pop();
					if(q==0)
						System.out.println("Stack empty");

					else
						System.out.println("Popped element= "+q);
				}
				else if(cho==3)
					stack.display();
				else
					break;
			}
			
		}

	}
}
