import java.util.*;
class queue
{
	private int a[],front,rear,capacity;
	queue(int cap)
	{
		capacity=cap;
		a=new int[capacity];
		front=0;
		rear=0;
	}
	public void enqueue(int ele)
	{
		if(isfull())
			System.out.println("Queue full");
		else
		{
			a[rear]=ele;
			rear++;
		}
	}
	public int dequeue()
	{
		if(isempty())
			return -99;
			//System.out.println("Queue empty");
		else
		{
		int val=a[front];
		if(front!=rear)
			front++;
		return val;
		}

	}
	public boolean isfull()
	{
		if(rear==capacity)
			return true;
		else
			return false;
	}
	public boolean isempty()
	{
		if(front==rear)
			return true;
		else
			return false;
	}
	public void display()
	{
		if(isempty())
			System.out.println("Queue empty");
		else
		{
			System.out.print("\nQueue :");
			for(int i=front;i<rear;i++)
				System.out.print(a[i]+" ");
		}
	}
	
}
public class QueueOp {
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter capacity of the Queue");
		int cap=input.nextInt();
		queue q=new queue(cap);
		while(true)
		{
		System.out.println("\n1.Enqueue\n2.Dequeue\n3.Display\nAny Other to exit");
		int ch=input.nextInt();
		if(ch==1)
		{
			System.out.println("Enter the element to enqueue");
			int e=input.nextInt();
			q.enqueue(e);
		}
		else if(ch==2)
		{
			int p=q.dequeue();
			if(p==-99)
				System.out.println("queue empty");
				
			else
				System.out.println("dequeued element= "+p);
		}
		else if(ch==3)
			q.display();
		else
			break;
	}
		input.close();
			
	
		
	}

}
