import java.util.ArrayList;
import java.util.Scanner;
interface priorityfun<T extends Number>
{
	void insert(T data,int priority);
	T delete();
}
class data<T extends Number>
{
	private T val;
	private int priority;
	void setvalnp(T val,int priority)
	{
		this.val=val;
		this.priority=priority;
	}
	T getval(){
		return val;
	}
	int getpriortity()
	{
		return priority;
	}
	
}
class pqueue<T extends Number> implements priorityfun<T>
{
	private ArrayList<T> pq;
	private ArrayList<Integer> prior;
	pqueue()
	{
		pq=new ArrayList<T>();
		prior=new ArrayList<Integer>();
	}

	public void insert(T val, int priority) {
		int i=0;
		for(i=0;!prior.isEmpty() && i<prior.size() && priority>prior.get(i).doubleValue();i++)
		{
			
		}
		pq.add(i,val);
		prior.add(i,priority);
		
	}

	public T delete() throws IndexOutOfBoundsException{
		if(pq.isEmpty())
			throw new IndexOutOfBoundsException("List is empty");
		T val=pq.get(0);
		pq.remove(val);
		return val;
	}
	public void display()
	{
		System.out.println(pq);
			
	}
}
public class PriorityQueueOp {
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		pqueue<Double> p=new pqueue<Double>();
		while(true)
		{
			System.out.println("1.Insert\n2.Delete\n3.display\nAny to exit");
			int ch=input.nextInt();
			if(ch==1)
			{
				System.out.println("Enter the element and its priority(1 being highest)");
				p.insert(input.nextDouble(), input.nextInt());
			}
			else if(ch==2)
			{
				try
				{
				System.out.println("Deleted element = "+p.delete());
				}
				catch(IndexOutOfBoundsException e)
				{
					e.printStackTrace();
				}
			}
			else if(ch==3)
			{
				p.display();
			}
			else
				break;
		}
		input.close();
	}

}
